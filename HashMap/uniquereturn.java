import java.util.HashMap;

public class uniquereturn {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 2, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find first unique element
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println(num);
                return;
            }
        }

        System.out.println("No unique element");
    }
}