public class largest {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int sum=arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>sum){
                sum=arr[i];
            }
        }
        System.out.println(sum);
    }
    
}
