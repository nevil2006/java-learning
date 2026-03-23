import java.util.HashSet;

public class unique {
    public static void main(String[] args) {

        int[]arr={1,2,3,2,3,1,4};

        HashSet<Integer>Set= new HashSet<>();

        for(int num:arr){
            if(Set.contains(num)){
                System.out.println("false");
                return;

            }
            Set.add(num);
        }
        System.out.println("true");

    }
    
}
