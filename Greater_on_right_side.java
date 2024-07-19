public class Next_greatest_elements {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        replaceWithNextGreatest(array);
        System.out.println("Modified array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void replaceWithNextGreatest(int[] array) {
        int n = array.length;
        
        int maxFromRight = -1;
        
        for (int i = n - 1; i >= 0; i--) {
            int current = array[i];
            
            array[i] = maxFromRight;
            
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }
    }
}
