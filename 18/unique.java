import java.util.HashSet;

public class unique{
    public static void main(String[] args) {
        int[]arr={1,2,1,3,1,2,4};
        HashSet<Integer>set=new HashSet<>();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
