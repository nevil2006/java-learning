import java.util.Arrays;
import java.util.Scanner;
public class one { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x=in.nextInt();

        int[]arr=new int[x];

        for(int i=0;i<x;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));


        
    }

    
}
