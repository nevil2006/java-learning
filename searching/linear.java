import java.util.*;

public class linear {

    static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void linear(int[] arr, int length, int key) {

        for(int i = 0; i < length; i++) {

            if(key == arr[i]) {

                swap(arr, i, 0);

                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {8,9,4,7,6,3,20,5,14,2};

        int length = arr.length;

        int key = 20;

        linear(arr, length, key);

        System.out.println(Arrays.toString(arr));
    }
}