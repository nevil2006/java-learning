import java.util.*;
public class order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        for(int i=c.length()-1;i>=0;i--){
            System.out.println(c.charAt(i));
        }
    }
    
}
