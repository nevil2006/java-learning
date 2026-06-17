import java.util.*;
public class cha {
        public static void main(String[] args) {
            ArrayList<Character>list= new ArrayList<>();
            list.add('a');
            list.add('e');
            list.add('d');
            list.add('f');
            list.add('z');

            int count = 0;
            for(char c:list){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u' ){
                    count ++;
                }
            }
            System.out.println(count);

        }

}
