class LinearSearch {

    static int linearSearch(int arr[], int key) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {8, 9, 4, 7, 6, 3, 20, 5, 14, 2};

        int key = 20;

        int result = linearSearch(arr, key);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}