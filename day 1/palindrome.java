public class palindrome {
        public static void main(String[] args){
            int n = 121;
            int original = n;
            int revNum = 0;
            while(n>0){
                revNum = revNum * 10 + n %10;
                n = n /10;
            }
            if(original == revNum){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
}
