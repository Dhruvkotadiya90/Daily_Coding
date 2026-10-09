
public class Day9_Move_Zeroes_To_End {

    // Main Method
    public static void main(String[] args) {
        
        int[] arr = {2, 0, 0, 35, 0, 40};

        // Access Index Using Pointer Variable
        int index = 0;
        
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] != 0){
                
                arr[index] = arr[i];
                index++;
            }

        }
        for (int i = index; i < arr.length; i++) {
            
            arr[i] = 0;
            
        }
        
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        
        }
        
}

// OUTPUT:
// 2 35 40 0 0 0
