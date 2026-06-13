import java.util.*;

public class merge {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(10);
        a.add(20);

        b.add(30);
        b.add(40);

        a.addAll(b);

        System.out.println(a);
    }
}