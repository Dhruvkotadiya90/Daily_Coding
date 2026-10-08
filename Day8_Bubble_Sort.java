// Main Class
class Day8_Bubble_Sort {

    // Static Array
    static int[] arr = {2, 10, 43, 21, 98, 54, 33, 12};

    // Method to rotate the array
    public static int rotate_Array(int[] arr) {
        
        // Sorting the array in ascending order using bubble sort
        for (int i = 0; i<arr.length ; i++){
            for(int j = 0; j < arr.length - 1 ; j++){

                if( arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        return 0;
        
    }

    public static void main(String[] args) {
        
        rotate_Array(arr);

    }

}