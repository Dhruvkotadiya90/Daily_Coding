// Class
class Day6_Largest_Element_In_Array{

    // Global Array Declaration
    static int[] arr = {2, 10, 43, 21, 98, 54, 33, 12};
    public static void main(String[] args) {
        
        // Find the largest element in the array
        // Call "findLargest" method and pass the array as an argument
        int largest = findLargest(arr);
        System.out.println("Largest element in the array is: " + largest);

    }

    // static method to find the largest element in the array
    public static int findLargest(int[] arr) {

        // Assume First Element of Array is the largest
        int largest = arr[0];

        // Traverse the array
        for( int i = 0; i < arr.length; i++ ){

            // Compare each element with the largest
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;

    }
}