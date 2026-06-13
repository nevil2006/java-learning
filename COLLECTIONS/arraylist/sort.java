import java.util.*;

public class sort {

    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>();

        c.add(130);
        c.add(450);
        c.add(50);

        System.out.println("Before Sort: " + c);

        Collections.sort(c);

        System.out.println("After Sort: " + c);

        if(c.contains(140)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
    }
}