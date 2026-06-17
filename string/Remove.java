import java.util.*;
public class remove{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n =sc.nextLine();
        System.out.println(n.trim());
        System.out.println(n.replace(" ",""));
        System.out.println(n.replace(" "," _"));
    }
}