package Array;
import java.util.Stack;

public class Search_Method {

    public static void main(String[] args) {
        // creating stack
        Stack<String> yawa = new Stack<>();

        // populating stack
        yawa.push("Java");
        yawa.push("Source");
        yawa.push("code");

        // searching 'code' element
        System.out.println("Searching 'code' in stack: " + yawa.search("code"));
    }
}
