package labs_examples.arrays.labs;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Populate the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Access elements within the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index " + i + ": " + arrayList.get(i));
        }

        // Explore ArrayList methods
        System.out.println("\nMethods available for ArrayList:");
        System.out.println("-------------------------------");
        for (Method method : arrayListMethods()) {
            System.out.println(method);
        }
    }

    // Method to list available methods for ArrayList
    public static Method[] arrayListMethods() {
        ArrayList<Integer> temp = new ArrayList<>();
        return temp.getClass().getMethods();
    }
}
