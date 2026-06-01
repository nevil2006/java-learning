import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("duplicates:"+ set);
                return; 
            }
            set.add(num);
        }

        // if no duplicate found
        System.out.println("false");
    }
}