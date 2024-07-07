package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        int product = Calculator.multiply(10, 5);
        System.out.println(product);

        int value = Calculator.divide(10, 5);
        System.out.println(value);

        Print.printJoke();

        int years = 2;
        long seconds = Calculator.yearsToSeconds(years);
        System.out.println(years + " years is equal to " + seconds + " seconds.");

        int length = Calculator.varargsLength(1, 2, 3, 4, 5);
        System.out.println("The length of the varargs array is: " + length);
    }

}

class Calculator {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years) {
        int secondsInAYear = 365 * 24 * 60 * 60;
        return (long) years * secondsInAYear;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargsLength(int... numbers) {
        return numbers.length;
    }
}

class Print {
    public static void printJoke() {
        System.out.println("Why did the chicken cross the road? BEKOS!");
    }
}
