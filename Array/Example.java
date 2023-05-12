package Array;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Insert the number 4 at index 1
        list.add(1, 4);

        System.out.println("List after insert: " + list);
    }
}
