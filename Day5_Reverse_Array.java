// Question : Reverse an entire array
// for example if an array a[5] = [10,20,30,40,50] is given than do a[5] = [50,40,30,20,10]

class Day5_Reverse_Array{

    static int[] arr = {10, 20, 30, 40, 50};
    public static void main(String[] args) {
        
        // Initial Array
        System.out.println(" Before Reversing Array :");
        for(int i = 0; i < arr.length; i++){
            System.out.println(" Index : " + i + " Element : " + arr[i]);
        }

        System.out.println(" After Reversing Array : ");

            int i = 0;
            int j = arr.length - 1;
            int temp;

                while (i < j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }

                for(int k = 0; k < arr.length; k++){
                    System.out.println(" Index : " + k + " Element : " + arr[k]);
                }
            
        }

    }