import java.util.*;
public class max {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(List.of(10,200,30,50));
        int sum =0;
        for(int x:list){
            sum += x;
        }
        System.out.println(sum);
    }
}
