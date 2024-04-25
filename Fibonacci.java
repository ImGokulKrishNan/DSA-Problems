public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibi(n));

    }
    static int  fibi(int n){
        if(n<2){
            return n;
        }
        return  fibi(n-1)+fibi(n-2);
    }
}
