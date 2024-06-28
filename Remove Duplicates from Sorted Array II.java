package Arrays;

import java.util.Arrays;

public class RemoveduplicateSortedArrayll {

    public static void main(String[] args) {
        int[] n={0,0,1,1,1,2,3,3,4};
       int k= remove(n);
        for (int i = 0; i <k ; i++) {
            System.out.print(n[i]+" ");
        }

    }
    static int remove(int[] n){
        if(n.length < 3){
            return n.length;
        }int index=2;int l=2;
        while(l < n.length) {
            if (n[index-2] != n[l]) {
                n[index++] = n[l];
            }
            l++;
        }
        return index;
    }
}
