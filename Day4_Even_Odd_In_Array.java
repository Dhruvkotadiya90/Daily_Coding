class Day4_Even_Odd_In_Array{

    public static void main(String[] args) {
        
        int arr[] = {12, 4, 5, 3, 19, 2, 10, 23, 45};

        int even = 0;
        int odd = 0;

        for (int i = 0; i<arr.length; i++) {

            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;

        }

        System.out.println("Even numbers in the array: " + even);

        System.out.println("Odd numbers in the array: " + odd);

    }

}