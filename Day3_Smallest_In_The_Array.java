// Main Class

public class Day3_Smallest_In_The_Array{

    // Main Method
    public static void main(String[] args) {
        
        // Array Declaration
        int[] arr = {5, 2, 12, 4, 19, 8, 3};

        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] < smallest){
                smallest = arr[i];
            }

        }

        System.out.println("Smallest Element In The Array Is: " + smallest);

    }

}