import java.util.Scanner;
public  class typecasting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=(int)(67.89f);
        System.out.println(num);

        // int a=257;
        // byte b=(byte)(a);
        // System.out.println(b);

        byte a=40;
        byte c=20;
        byte b=100;
        int d=(a*b)/c;
        System.out.println(d);

        int number='N';
        System.out.println(number);

        System.out.println("നെവിൾ");
    }
}