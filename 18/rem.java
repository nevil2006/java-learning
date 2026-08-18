import java.util.HashSet;

public class rem {
    public static void main(String[] args) {
        int[]arr={1,2,3,1,2};
        HashSet<Integer>set=new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
