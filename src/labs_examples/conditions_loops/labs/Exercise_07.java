package labs_examples.conditions_loops.labs;
import javax.swing.text.ParagraphView;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert to lower case to handle case insensitivity

        String vowels = "aeiou";
        int index = 0;
        char firstVowel = '\0'; // Initialize with null character

        // Using while loop to find the first vowel
        while (index < word.length()) {
            char currentChar = word.charAt(index);
            if (vowels.indexOf(currentChar) != -1) {
                firstVowel = currentChar;
                break;
            }
            index++;
        }

        // Printing the result
        if (firstVowel != '\0') {
            System.out.println("The word is: " + word);
            System.out.println("The first vowel is: " + firstVowel);
        } else {
            System.out.println("No vowels found in the word.");
        }

        scanner.close();
    }
}
