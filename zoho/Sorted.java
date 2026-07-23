public class Sorted {
    public static void main(String[] args) {
        int[]arr={10,20,30,60,50};
        boolean isSorted = true;
        for(int i = 1; i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
