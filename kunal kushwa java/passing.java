import java.util.Arrays;

public class passing {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 78, 9};

        System.out.println("Original: " + Arrays.toString(nums));

        alter(nums);

        System.out.println("After alter: " + Arrays.toString(nums));

        int[] arr = sort(nums);

        System.out.println("After sort: " + Arrays.toString(arr));
    }

    static void alter(int[] arr) {
        arr[2] = 100;
    }

    static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}