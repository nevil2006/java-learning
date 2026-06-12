import java.util.*;

public class second {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int first = Collections.max(list);

        list.remove(Integer.valueOf(first));

        int second = Collections.max(list);

        System.out.println("Largest = " + first);

        System.out.println("Second Largest = " + second);
    }
}