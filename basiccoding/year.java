package basiccoding;
import java.util.*;
public class year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        if(a%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
    
}
