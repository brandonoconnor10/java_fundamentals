package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        // Create and populate an irregular 2D array
        int[][] irregularArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {10},
                {11, 12, 13}
        };

        // Iterate and print each element using nested for-each loop
        for (int[] row : irregularArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
