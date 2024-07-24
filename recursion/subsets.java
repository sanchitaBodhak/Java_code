package recursion;

public class subsets {
    public static void printSubsets(int i ,String s,String ans){
        if (i == s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1 ,s ,ans+ch);   // not take
        printSubsets(i+1 ,s , ans);         //take
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubsets(0,s,"");
    }
}
