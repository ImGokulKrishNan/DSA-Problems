import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
          
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){

            int[] temp=new int[arr.length];
            if(i!=j){
          temp[i]=arr[i];
            arr[i]=arr[j];
           arr[j]=temp[i];
                i++;
                j--;
            }
        }System.out.println(Arrays.toString(arr));

    }
    
}
