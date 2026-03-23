import java.util.HashSet;

public class twothree {
    public static void main(String[] args) {
        int[] arr = {52, 60, 60, 90, 52};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate: " + num);
            } else {
                set.add(num);
            }
        }
    }
}