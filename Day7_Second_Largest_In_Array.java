// Main Class
class Day7_Second_Largest_In_Array {

    // Declare the array and initializing the largest and second largest variables
    static int[] arr = {2, 10, 43, 21, 98, 54, 33, 12};
    static int largest = arr[0];
    static int sec_largest = largest;

    // Method to find the second largest number in the array
    public static int sec_largest(int[] arr) {

        // Iterate through the array to find the largest and second largest numbers
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_largest && arr[i] != largest) {
                sec_largest = arr[i];
            }
        }

        return sec_largest;

    }

    public static void main(String[] args){
        
        System.out.println("The second largest number in the array is: " + sec_largest(arr));
    }

}