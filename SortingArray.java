import java.util.Arrays;
public class SortingArray{


    public static void main(String[]args) {
        int[] arr={0,1,2,3,1,3,1};

    for(int k=0;k<arr.length;k++){
        for(int j=1,i=0;j<arr.length;j++,i++){
            
            if(arr[i]>arr[j]){
    
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
            } 
        }           
       }
       System.out.println(Arrays.toString(arr));    

       
   }
}
