import java.util.Arrays;
public class RemoveduplicateSortedArray {
    public static void main(String[] args) {
        int[] n = {1,2,2};

       int k= remove(n);
        for (int i = 0; i < k ; i++) {
            System.out.print(n[i]);
        }
    }
    static int remove(int[] n){
        if(n.length==0){
            return 0;
        }
        int i=0;int j=1;
        while(j < n.length){
            if(n[i]!=n[j]){
                i++;
                n[i]=n[j];
            }j++;

        }
        return i+1;
    }
         }
