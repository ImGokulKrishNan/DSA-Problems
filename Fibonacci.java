package Maths;

public class Fibonacci {
    public static void main(String[] args) {
       int n=10;
        for (int i = 0; i < n ; i++) {
            System.out.print (fibi(i)+" ");
        }
    }
    static int fibi(int n){
        if(n <= 1)
            return n;

        return fibi(n-1)+fibi(n-2);
    }
}
