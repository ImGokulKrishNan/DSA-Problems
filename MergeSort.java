
import java.util.ArrayList;
import java.util.Arrays;

public class MerageSorting {
    public static void main(String[] args) {
        int[] n = {27, 89, 34, 62, 75, 13, 96, 48, 17, 53, 29, 84, 41, 70, 6, 91, 23, 55, 36, 12, 77, 99, 50, 32, 45, 81,};
         int[] k=  divide(n);
        System.out.println(Arrays.toString(k));
    }
    static int[] divide(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left =divide(Arrays.copyOfRange(arr,0,mid));
        int[] right =divide(Arrays.copyOfRange(arr,mid,arr.length));

       return  mergesort(left,right);
    }


static int[] mergesort(int num1[],int num2[]){
    int[] merge =new int[num1.length+num2.length];
    int i=0;
    int j=0;
    int k=0;

    while(i < num1.length && j < num2.length){
        if(num1[i] < num2[j]){
            merge[k]=num1[i];
            i++;
        }
        else{
            merge[k]=num2[j];
            j++;
        }
        k++;
    }
    while(i < num1.length){

        merge[k++]=num1[i++];
    }
    while(j < num2.length){
        merge[k++]=num2[j++];
    }
        return merge;
}

}
