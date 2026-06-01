import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();
        String t = sc.nextLine();

        // Call function
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return c;
            }
            map.put(c, map.get(c) - 1);
        }

        return ' ';
    }
}