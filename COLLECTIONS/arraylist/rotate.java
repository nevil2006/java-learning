import java.util.*;

public class rotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter number of elements:");

        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {

            list.add(sc.nextInt());

        }

        System.out.println("Enter k value:");

        int k = sc.nextInt();

        System.out.println("Original List:");
        System.out.println(list);

        Collections.rotate(list, k);

        System.out.println("After Right Rotation:");
        System.out.println(list);
    }
}