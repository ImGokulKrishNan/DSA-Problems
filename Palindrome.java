public class Palindrome {
    public static void main(String[] args) {
        int n = -121;

        System.out.println(find(n));

    }
    static boolean find(int n) {
        int sum = 0;
        int temp=n;
        while (n > 0) {
            
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(sum-temp==0){

            return true;
        }
        return false;

    }
}
