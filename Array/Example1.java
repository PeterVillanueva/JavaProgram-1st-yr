package Array;
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Insert the word "date" at index 1
        list.add(1, "date");

        System.out.println("List after insert: " + list);
    }
}
