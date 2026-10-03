public class Day3_Smallest_In_The_Array{

    public static void main(String[] args) {
        
        int[] arr = {5, 2, 12, 4, 19, 8, 3};

        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            
        }

    }

}