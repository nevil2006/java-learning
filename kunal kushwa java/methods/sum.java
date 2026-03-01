import java.util.*;
public class sum {
    public static void main(String[] args) {
        sum();
    }
        
    static void sum(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value 1:");
            int num1= sc.nextInt();
            System.out.println("Enter the value 2:");
            int  num2=sc.nextInt();
            int  sum=num1+num2;
            System.out.println("The sum =" +sum);

    }
}
