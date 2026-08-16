public class diff {
    public static void main(String[] args) {
        int[]arr={10, 25, 5, 40, 15};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        int difference= largest - smallest;
        System.out.println(difference);
    }   
}
