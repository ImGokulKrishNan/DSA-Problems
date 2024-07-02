package Arrays;

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] n={3,2,2,1,1,2,2,2,3};
        int k=find(n);
        System.out.println(k);

    }
    static int find(int[] n){
        if(n.length==1|| n.length==0){
            return n[n.length-1];
        }
        int i=0;int j=1;int m=n.length/2;
        Arrays.sort(n);
        int k=1;int count =1;int element=0;
        while(j < n.length){

            if(n[i]==n[j]){
                count++;
            }
            if(n[i]!=n[j]){
                i=j;
                count=1;
            }
            if(m <= count){
                m=count;
                element=n[i];
            }
            j++;
        }
        return element;
    }
}
