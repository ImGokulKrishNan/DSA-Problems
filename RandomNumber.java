package Maths;

public class RandomNumber {
    public static void main(String[] args) {

      int min=0;
      int max=100;
        int k=(int)(Math.random()*(max-min+1)+min);
        System.out.println(k);
    }
}
