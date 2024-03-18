public class Twosumarray {     

      public static void main(String[] args) {
        int start=0;
        int end=arr.length-1;
        int target=7;
        int[] num=new int[2];
 
while(start<=end){
    if(arr[start]+arr[end]==target){
         num[0]=start;
         num[1]=end;
         System.out.println(start+" "+end);
         break;
    }
    start++;
    end=arr.length-1;

}      
    }
}
  
