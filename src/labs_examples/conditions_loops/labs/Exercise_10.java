package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        // Using a for loop to demonstrate the continue statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Continue statement to skip the current iteration when i equals 5
                continue;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop completed, skipping number 5.");
    }
}
