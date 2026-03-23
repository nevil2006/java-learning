import java.util.HashSet;

public class remove {
    public static void main(String[] args) {
        
        int[]arr={1,1,2,2,3};

        HashSet<Integer>Set=new HashSet<>();
        for(int num:arr){
                Set.add(num);
            }
        System.out.println(Set);
    }
    
}
