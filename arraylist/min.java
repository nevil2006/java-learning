import java.util.*;

public class min {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(List.of(10, 200, 30, 50));

        int min = Integer.MAX_VALUE;

        for(int x : list) {
            min = Math.min(min, x);
        }

        System.out.println(min);
    }
}