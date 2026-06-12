import java.util.*;

public class integer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(50);
        list.add(30);
        list.add(10);
        list.add(15);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        int maxgap = 0;

        for(int i = 1; i < list.size(); i++) {

            int gap = list.get(i) - list.get(i - 1);

            if(gap > maxgap) {
                maxgap = gap;
            }

            System.out.println(gap);
        }

        System.out.println("Maximum Gap = " + maxgap);
    }
}