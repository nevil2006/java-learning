import java.util.*;

public class eveood {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(41);
        list.add(50);
        list.add(71);

        System.out.println(list);

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i) % 2 == 0) {

                System.out.println(
                        list.get(i) + " is Even Number");

            }

            else {

                System.out.println(
                        list.get(i) + " is Odd Number");

            }
        }
    }
}