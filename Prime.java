public class Prime {
    public static void main(String args[]) {
        int n=10;
        System.out.println(countPrimes(n));

    }
    static  int countPrimes ( int n){
        if (n <= 1)
            return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (pri(i)) {
                 count++;
            }
        }
        return count;
    }
    static boolean pri ( int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
