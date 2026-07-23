public class secondlargest {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,60};
        int largest=arr[0];
        int secondlargest =arr[0];
        for(int i =1 ; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>secondlargest && arr[i] != largest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}
