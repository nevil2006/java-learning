import java.util.HashSet;

public class unsort {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        // Store first array
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Check second array
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                System.out.print(arr2[j]+",");
            }
        }
    }
}