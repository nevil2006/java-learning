public class toogle {
    public static void main(String[] args) {
        String s ="Hello java";
        String ans ="";

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&& ch <='z'){
                ch =  (char)(ch-32);
            }
            else if(ch>='A'&& ch <='Z'){
                ch = (char)(ch+32);
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}
