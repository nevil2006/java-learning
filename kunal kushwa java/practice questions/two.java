import java.util.Scanner;
public class two {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value for a");
            int a=sc.nextInt();
            System.out.println("Enter value for b");
            int b=sc.nextInt();

            int n=a+b;
            int m=a*b;
            int c=a-b;
            int d=a/b;
            System.out.println(n);
            System.out.println(m);
            System.out.println(c);
            System.out.println(d);
    }
    
}
