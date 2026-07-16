import java.util.*;
public class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i< n;i++){
            arr[i]=sc.nextInt();
        }
        int largest= ar[0];
        for(int i =1 ;i<n;i++){
            if(arr[i]>largest){
                 largest = arr[i];
        }
    }

    System.out.println("largest = "+ largest);

    }
}