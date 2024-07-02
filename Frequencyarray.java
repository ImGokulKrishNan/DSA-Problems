/*
find the frequency of each element in the array or Counting frequencies of array elements


import java.util.*;
class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 6, 1, 2, 5, 6, 7, 8};
        //{1=3, 2=2, 3=1, 4=1, 5=1, 6=2, 7=1, 8=1}

        freq(arr);
    }
    static void freq(int[] arr) {

        boolean[] arr1=new boolean[arr.length];
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();


        for (int i = 0; i < arr.length*arr.length; i++) {
            if (arr[start] == arr[end]) {
                count++;
                arr1[end]=true;
            }
            end--;
            if (end == -1) {
                map.put(arr[start],count);
            start++;
            end = arr.length - 1;
            count = 0;
        }
    }
        System.out.println(map.toString());
        
    }
    }
///{1=3, 2=2, 3=1, 4=1, 5=1, 6=2, 7=1, 8=1}
*/