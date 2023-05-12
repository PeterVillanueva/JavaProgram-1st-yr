//INSERT METHOD IN JAVA

//StringBuilder.insert(int offset, <value to be inserted>);

//or

//StringBuffer.insert(int offset, <value to be inserted>);

//where offset is the position at which the value is to be inserted, 
//and the value to be inserted can be a string, a character, a boolean, a float, a double, an int, or a long.
package Array;

public class Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Java "); //This will insert the string "Java " at position 6 in the original string "Hello World", resulting in the new string "Hello Java World".
        System.out.println(sb);
    }
}

//Output: Hello Java World