//import scanner to take user input

import java.util.Scanner;

//main class
public class Day01_EvenOdd {

    //main method
    public static void main(String[] args) {

        //define scanner as variable "sc"
        Scanner sc = new Scanner(System.in);

        //take input through scanner class
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // define functional logic for even & odd
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        sc.close();
    }
}

// Expected Output :
// Enter a nmuber : 24
