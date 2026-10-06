// Class
class Day6_Largest_Element_In_Array{


    // Global Array Declaration
    static int[] arr = {2, 10, 43, 21, 98, 54, 33, 12};
    public static void main(String[] args) {
        
        // Find the largest element in the array
        int largest = findLargest(arr);
        System.out.println("Largest element in the array is: " + largest);

    }

    public static int findLargest(int[] arr) {

        int largest = arr[0];
        return largest;

    }
}