import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of String type
        Vector<String> v = new Vector<String>();

        // Adding elements to the Vector
        v.add("Java");
        v.add("Python");
        v.add("C++");

        // Accessing elements of the Vector
        System.out.println("Elements of the Vector:");
        for (String element : v) {
            System.out.println(element);
        }

        // Checking the size of the Vector
        System.out.println("Size of the Vector: " + v.size());

        // Removing an element from the Vector
        v.remove("Python");

        // Checking the size of the Vector after removing an element
        System.out.println("Size of the Vector after removing an element: " + v.size());
    }
}






