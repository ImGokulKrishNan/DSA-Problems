import java.util.Arrays;

public class Matrix {
    
    public static void main(String[] args) {
        
       int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
  

            int n=arr.length;
        for(int i =0;i<arr.length;i++){
            for(int j=n-1;j>-1;j--){

               System.out.print(arr[j][i]+" ");
            }System.out.println(" ");
        }
        
    }
}

/* 
1,2,3           7,3,1      
3,4,5  --->     8,4,2
7,8,9           9,5,3
*/
