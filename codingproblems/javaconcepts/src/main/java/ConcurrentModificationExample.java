import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {

    public static void main(String[] args) {
        // Create a list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get an iterator
        Iterator<String> iterator = fruits.iterator();

        // Iterate over the list
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // Simulate concurrent modification by adding an element while iterating
            if (fruit.equals("Banana")) {
                fruits.add("Grapes"); // This will throw ConcurrentModificationException
            }
        }
    }

}
