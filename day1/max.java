
public class max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int mfx=arr[0];
        for(int i=1;i<arr.length;i++){
            if(mfx<arr[i]){
                mfx=arr[i];
            }
        
        }
        System.out.print(mfx);

    }    
}
