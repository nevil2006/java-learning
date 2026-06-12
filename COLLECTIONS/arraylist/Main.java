import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Original List:");
        System.out.println(list);

        System.out.println("Duplicate Elements:");

        for(int i = 0; i < list.size(); i++) {

            for(int j = i + 1; j < list.size(); j++) {

                if(list.get(i).equals(list.get(j))) {

                    System.out.println(list.get(i));

                    break;
                }
            }
        }
    }
}