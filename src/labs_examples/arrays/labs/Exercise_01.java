package labs_examples.arrays.labs;
import java.util.Scanner;

import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console..
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store 10 numbers
        int[] numbers = new int[10];

        // Taking input from the user
        System.out.println("Enter 10 numbers, one by one:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the results
        System.out.println("The sum of all numbers is: " + sum);
        System.out.println("The average of all numbers is: " + average);

        scanner.close();
    }
}