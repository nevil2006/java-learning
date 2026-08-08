public class main{
    public static void main(String[] args){
        String s = "I HELLO VANAKAM";
        String ans = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch <='Z'){
                ch = (char)(ch+32);
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}

