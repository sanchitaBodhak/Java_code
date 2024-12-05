package Stack;
import java.util.Stack;

public class prefixEvaluation {

    static Boolean isOperand(char c)
    {
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

    static double evaluatePrefix(String exprsn) {
        Stack<Double> Stack = new Stack<Double>();

        for (int j = exprsn.length() - 1; j >= 0; j--) {


            if (isOperand(exprsn.charAt(j)))
                Stack.push((double) (exprsn.charAt(j) - 48));

            else {

                
                double o1 = Stack.peek();
                Stack.pop();
                double o2 = Stack.peek();
                Stack.pop();


                switch (exprsn.charAt(j)) {
                    case '+':
                        Stack.push(o1 + o2);
                        break;
                    case '-':
                        Stack.push(o1 - o2);
                        break;
                    case '*':
                        Stack.push(o1 * o2);
                        break;
                    case '/':
                        Stack.push(o1 / o2);
                        break;
                }
            }
        }

        return Stack.peek();
    }
    public static void main(String[] args)
    {
        String exprsn = "+9*26";
        System.out.println(evaluatePrefix(exprsn));
    }
}


