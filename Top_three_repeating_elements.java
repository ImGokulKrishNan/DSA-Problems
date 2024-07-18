import java.util.*;

public class Top_repeating_elements {

    public static void main(String[] args) {

        int[] num={3,4,2,3,16,3,15,16,15,15,16,2,3};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : num) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        // Create a list from the elements of the map
        List<HashMap.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());

        // Sort the list based on the frequency in descending order
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print the top three repeated numbers
        System.out.println("Top three repeated numbers are:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey());
        }

    }
}
