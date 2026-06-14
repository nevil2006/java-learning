import java.util.*;

public class vowels {

    public static void main(String[] args) {

        String cont = "education";

        int count = 0;

        for(int i = 0; i < cont.length(); i++) {

            char c = cont.charAt(i);

            if(c == 'a' || c == 'e' ||
               c == 'i' || c == 'o' ||
               c == 'u') {

                count++;
            }
        }

        System.out.println("Vowel Count = " + count);
    }
}