import java.util.*;
public class brute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String input=sc.nextLine();
        String result=" ";

        for(int i=0;i<input.length();i+=2){
            char ch=input.charAt(i);
            int count=input.charAt(i+1)-'0';

        for(int j=0;j<count;j++){
            result+=ch;
            }
        }
        System.out.println(result);
    }
    
}