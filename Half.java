import java.util.Scanner;
public class Half {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+i-3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}