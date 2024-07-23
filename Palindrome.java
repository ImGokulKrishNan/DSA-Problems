package Maths;

public class Palindrome {
    public static void main(String[] args) {
        int n=5445;
            if (pol(n)) {
                System.out.println("true");
            }
    }
    static boolean pol(int n) {

        int temp = n;
        int r = 0;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
            System.out.println("sum :"+sum+" | "+"r :"+r+" |"+"n :"+n);
        }
        return sum == temp ? true : false;
    }
}
