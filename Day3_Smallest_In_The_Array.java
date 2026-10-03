// Main Class

public class Day3_Smallest_In_The_Array{

    // Main Method
    public static void main(String[] args) {
        
        // Array Declaration
        int[] arr = {5, 2, 12, 4, 19, 8, 3};

        // Assume First Element As Smallest
        int smallest = arr[0];

        // Iterate Through The Array To Find The Smallest Element
        for(int i = 0; i < arr.length; i++){
            
            // Check If Current Element Is Smaller Than The Smallest Element
            if(arr[i] < smallest){
                smallest = arr[i];
            }

        }

        // Print The Smallest Element
        System.out.println("Smallest Element In The Array Is: " + smallest);

    }

}