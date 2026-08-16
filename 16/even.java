public class even {
    public static void main(String[] args) {
        int[]arr={31,25,55,88,91};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                count += arr[i];
            }
        }
        System.out.println(count);
    }
}
