package Queue;

public class leetcode1700_studentSandwiches {
    public static int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int k = 0;
        int j = 0;
        int x = -1;
        int miss = 0;
        while( j != n){
            if( sandwiches[j] == students[k]){
                k = k+1;
                j = j+1;
                miss = 0;
            }
            else{
                x = students[k];
                for( int a = k; a < n-1 ; a++){
                    students[a] = students[a+1];
                }
                students[n-1] = x;
                miss++;
            }
            if(miss == n){
                return n-k;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] stu = {1,1,1,0,0,1};
        int[] sand = { 1,0,0,0,1,1};
        int x = countStudents(stu,sand);
        System.out.println(x);
    }
}
