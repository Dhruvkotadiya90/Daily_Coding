public class Day11_Find_Max_Consecutive {
    

    static int arr[] = {1, 0, 1, 1, 0, 1};
    static int count = 0;
    static int maxCount = 0;

    public static int findConsecutive(int arr[]){
    
        for(int i = 0; i < arr.length; i++){

            if (arr[i] == 1){
                count++;
            }

        }        

        return 0;
    }


    public static void main(String[] args) {
        findConsecutive(arr);
    }

}
