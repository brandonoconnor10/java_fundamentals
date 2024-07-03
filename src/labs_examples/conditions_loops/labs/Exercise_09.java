package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        // Using a for loop to demonstrate the break statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Break statement to exit the loop when i equals 5
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop exited because break was encountered.");
    }
}
