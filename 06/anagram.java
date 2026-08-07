public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "sienta";
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        }
        int[]count=new int[26];
        for(int i = 0;i<str1.length();i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for(int i = 1;i<26;i++){
            if(count[i]!=0){
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram ");
    }
}
