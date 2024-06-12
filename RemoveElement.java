class Solution {
    public int removeElement(int[] n, int val) {
        int count=0;

        for(int i=0;i< n.length;i++){
            if(n[i]!=val){
                n[count++]=n[i];
            
            }

        }

        return count;
    }
}
