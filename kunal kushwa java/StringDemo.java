import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        // Modify element at index 1
        str[1] = "Nevil";

        System.out.println(Arrays.toString(str));

        in.close();
    }
}