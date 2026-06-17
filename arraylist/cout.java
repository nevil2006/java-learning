import java.util.*;

public class cout {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(List.of(10, 200, 30, 50));

        int max = Integer.MIN_VALUE;

        for(int x : list) {
            max = Math.max(max, x);
        }

        System.out.println(max);
    }
}