package Maths;

public class Prime {
    public static void main(String args[]) {

        for (int i = 0; i < 100; i++) {
            if (pri(i)) {
                System.out.print(i+" ");
            }
        }
    }
    static boolean pri(int n){

        if(n<=1)
            return false;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n%i==0)
                return false;
        }

        return true;
    }
}
