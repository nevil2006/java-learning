import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 30, 15};

        ArrayList<Integer> list = new ArrayList<>();

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        list.add(min);
        list.add(max);

        System.out.println(list);
    }
}