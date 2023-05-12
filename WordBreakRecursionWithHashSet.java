import java.util.*;

public class WordBreakRecursionWithHashSet {
    public static boolean wordBreak(String s, Set<String> hs) {
    	
        if (s.length() == 0) {
            return true;
        }

        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(0, i);
            if (hs.contains(substring) && wordBreak(s.substring(i), hs)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "Javaishard";
        Set<String> hs = new HashSet<>();
        hs.add("java");
        hs.add("programming");
        hs.add("is");
        hs.add("hard");
        hs.add("to");
        hs.add("learn");
        
        if (wordBreak(s, hs)) {
            System.out.println("String can be segmented");
        } else {
            System.out.println("String cannot be segmented");
        }
    }
}

