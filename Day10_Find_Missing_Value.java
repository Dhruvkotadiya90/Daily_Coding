class Day10_Find_Missing_Value{

    // Global Array Declaration 
    static int[] arr = {1, 2, 3, 5};
    static int n = arr.length + 1;
    static int arr_sum = 0;
    static int actual_sum = n * (n + 1) / 2;

    public static int findMissing(int[] arr){

        for(int i = 0; i < arr.length; i++){
            arr_sum += arr[i];
        }

        int missing_value = actual_sum - arr_sum;

        System.out.println("Missing Value in Array is: " + missing_value);

        return missing_value;
    }

    public static void main(String[] args) {
        
        findMissing(arr);

    }
}

// OUTPUT
