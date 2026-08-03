public class armstrong{
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum = sum + (digit*digit*digit);
            n = n/10;

        }
        if(original==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("armstrong");
        }
    }
}
