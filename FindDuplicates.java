package Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] n={1,2,3,4,6,2,3};
        int k= find(n);
        for (int i = 0; i < k ; i++) {
            System.out.print(n[i]+" ");
        }


    }
    static int find(int[] n){
        int dub=0;
        int k=1;int i=0;int j=0;
        while(k < n.length){
            if(k==n.length){
                i++;
                k=i;
            }
            if(n[i]==n[k]){
               n[j++]=n[i];
            }
            k++;
        }

        return j;
    }
}
