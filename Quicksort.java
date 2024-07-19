
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] n = {27, 89, 34, 62, 75, 13, 5, 15, 39, 78, 4, 88, 20, 58, 31, 93, 74};
        int p= partition(n,0,n.length-1);
        sort(n,0,p-1);
        sort(n,p+1,n.length-1);
        System.out.println(Arrays.toString(n));
    }

    static int partition(int[] n,int low,int high){
        int p=high;
        int k=0;
        int i=0;
        int j=0;
        while(k < high){

            if(n[j] > n[p]){
                j++;
            }
            if(n[j] < n[p]){
            int t=n[i];
            n[i]=n[j];
            n[j]=t;
            i++;
            j++;
            }
            k++;

        }

        int t=n[p];
        n[p]=n[i];
        n[i]=t;
        return i;
    }
    static void sort(int[] n,int low,int high){

        System.out.println(n[high]);
        int i=0;
        int j=high;
        int k=0;
        while(k <= high ){
            if(i==j){
                i++;
                j=high;
                k=i;
            }
            if(n[i] > n[j]){
                int t=n[i];
                n[i]=n[j];
                n[j]=t;
            }j--;

            k++;
        }

        }

}

