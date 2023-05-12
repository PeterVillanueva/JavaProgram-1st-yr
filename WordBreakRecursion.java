import java.util.HashSet;

public class WordBreakRecursion {
    
    public void wordBreak(String s, HashSet<String> hs) {
        wordBreakHelper(s, hs, "");
    }
    
    private void wordBreakHelper(String s, HashSet<String> hs, String out) {
        // base case
        if (s.length() == 0) {
            System.out.println(out);
            return;
        }
        
        // recursive case
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (hs.contains(prefix)) {
                String suffix = s.substring(i);
                wordBreakHelper(suffix, hs, out + prefix + " ");
            }
        }
    }
    
}