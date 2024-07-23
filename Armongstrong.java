package Maths;

public class Armongstrong {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(arm(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean arm(int n){
        int temp=n;int r=0;int sum=0;
        String s=String.valueOf(n);
        if(s.length()==2){
            return false;
        }
            int k=s.length();
        while (0 < n){
        r=n%10;
        sum=sum+(int)(Math.pow(r,k));
        n=n/10;
        }

        return sum==temp?true:false;
    }
}