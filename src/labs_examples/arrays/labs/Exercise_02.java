package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user (number from 1 to 10)
        System.out.print("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();

        // Validate user input
        if (number < 1 || number > 10) {
            System.out.println("Invalid input. Please enter a number from 1 to 10.");
        } else {
            // Find the index of the element in the array
            int index = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    index = i;
                    break;
                }
            }

            // Print the index of the element
            if (index != -1) {
                System.out.println("Index of " + number + " in the array is: " + index);
            } else {
                System.out.println(number + " was not found in the array.");
            }
        }

        scanner.close();

    }
}