package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0;
        int currentNumber = lowerBound;

        // Using while loop to calculate the sum
        while (currentNumber <= upperBound) {
            sum += currentNumber;
            currentNumber++;
        }

        // Printing the result
        System.out.println("The sum is: " + sum);
    }
}
