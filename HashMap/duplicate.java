import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("true");
                return;
            }
            set.add(num);
        }

        System.out.println("false");
    }
}