import java.util.ArrayList;

public class rev {

    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(5);
        c.add(6);
        c.add(47);

        System.out.println("Original List: " + c);

        for (int i = c.size() - 1; i >= 0; i--) {
            System.out.print(c.get(i) + " ");
        }
    }
}