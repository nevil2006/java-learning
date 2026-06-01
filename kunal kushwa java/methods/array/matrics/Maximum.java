import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        int max=Integer.MIN_VALUE;

        System.out.println("Enter matrix elements:");

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){

                arr[r][c]=sc.nextInt();

                if(arr[r][c]>max){
                    max=arr[r][c];
                }
            }
        }
        System.out.println("Max="+max);
        sc.close();
    }
    
}
