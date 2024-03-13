import java.util.Arrays;
class Main {

    public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
      int[] arr1=new int[arr.length];
      int j=arr.length;
      for(int i=0;i<arr.length;i++){
        arr1[j-1]=arr[i];
          j--;
      }System.out.println(Arrays.toString(arr1));

  
    }
}
