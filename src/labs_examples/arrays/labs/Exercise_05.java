package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // Create and populate an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print every other element in reverse order
        for (int i = array.length - 2; i >= 0; i -= 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to the next line after printing
    }
}
