import java.util.*;

public class feq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : list) {

            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } 
            else {
                map.put(i, 1);
            }
        }

        System.out.println(map);

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}