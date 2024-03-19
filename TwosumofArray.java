import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
         int[] arr={2,3,11,19,4,5,7};//output 5,6
        int  target=419;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
    static int[] twosum(int[] arr,int target){
                int start=0;
                int end=arr.length-1;
                int[] arr1=new int[2];
        while(start<=end){
                if(end==start){
                        start++;
                        end=arr.length-1;
                }
                else if(arr[start]+arr[end]==target){
                        arr1[0]=start;
                        arr1[1]=end;
                        break;
                }
                else{
                        end--;
                }

        }
        

        return arr1;
    }

}
