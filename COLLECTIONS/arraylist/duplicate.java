import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(30);
        System.out.println(l);
        HashSet<Integer>c=new HashSet<>(l);
        System.out.println(c);    

    }
    
}
