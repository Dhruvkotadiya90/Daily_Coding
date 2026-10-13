public class Day11_Find_Max_Consecutive {
    

    static int arr[] = {1, 0, 1, 1, 0, 1};
    

    public static int findConsecutive(int arr[]){
    
         int count = 0;
        int maxCount = 0;

        for(int i = 0; i < arr.length; i++){

            if (arr[i] == 1){
                count++;
            }
            else if(arr[i] == 0){
                count = 0;
            }
            else{}

            if(maxCount < count){
                maxCount = count;
            }
            else{}

        }        

        System.out.println("Max Consecutive 1's: " + maxCount);

        return 0;
    }


    public static void main(String[] args) {
        findConsecutive(arr);
    }

}

// OUTPUT
