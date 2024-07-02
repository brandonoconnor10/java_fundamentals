package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int b = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        /* returns true if Strings match */
        boolean equals = str.equals(str2);
        System.out.println(equals);

        // please concatenate str & str2 and set the result to a new String variable below
        String s = "String 1 and 2 is ... " + str + str2;
        System.out.println(s);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int search = "hello".indexOf("o");

        boolean equalStrings = str.equalsIgnoreCase(str2);
        System.out.println("Do str1 & str2 match? " + equalStrings);

        String subStr = str.substring(8, 12);
        System.out.println("The substring is: " + subStr);
    }


}