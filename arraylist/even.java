import java.util.*;
public class even {
    public static void main(String[]args){
        ArrayList<Integer> list =
                new ArrayList<>(List.of(10, 200, 30, 50,25,27,29,31,33));
        int count=0;
        for(int x:list){
            if(x % 2 ==0){
                count ++;
            }
        }
        System.out.println(count);
    }
    
}
