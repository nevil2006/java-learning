public class frequency{
    public static void main(String[] args) {
        String str = "apple";
        for(int i = 0;i<str.length();i++){
            boolean visited = false;
            for(int j = 1;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    visited = true;
                    break;
                }
            }
            if(visited){
                continue;
            }
            int count = 1;
            for(int j = 1+i;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i)+"="+count);
        }
    }
}