import java.util.*;

public class chardiff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String t = sc.nextLine();

        char result = 0;

        for (char c : S.toCharArray()) {
            result = (char)(result ^ c);
        }

        for (char c : t.toCharArray()) {
            result = (char)(result ^ c);
        }

        System.out.println(result);
    }
}