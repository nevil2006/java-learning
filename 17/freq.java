import java.util.HashMap;
public class freq{
    public static void main(String[] args) {
        int[]arr={10,20,30,50,60};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}