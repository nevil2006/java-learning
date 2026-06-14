import java.util.*;

public class duplstr {

    public static void main(String[] args) {

        String s = "programming";

        LinkedHashSet<Character> set =
                new LinkedHashSet<>();

        for(char ch : s.toCharArray()) {

            set.add(ch);

        }

        for(char ch : set) {

            System.out.print(ch);

        }
    }
}