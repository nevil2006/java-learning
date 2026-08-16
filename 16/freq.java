import java.util.*;
public class freq {
    public static void main(String[] args) {
        int[]arr={12,14,6,17,6,13,6};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i = 0 ;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }
}
