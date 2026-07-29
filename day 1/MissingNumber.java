public class MissingNumber {
    public static void main(String[] args) {
        int[]arr={3,0,1};
        int n =arr.length;
        int actualsum = 0;
        int expectedSum = n * (n + 1) / 2;
        for(int i =0;i<arr.length;i++){
            actualsum+=arr[i];
        }
        int result = expectedSum - actualsum;
        System.out.println(result);
    }
}