import java.util.*;
import java.io.*;

public class Anagrams {
    public static void main(String[] args) {
        int minGroupSize = Integer.parseInt(args[1]);
        Map<String, List<String>> m = new HashMap<String, List<String>>();
        try {
            Scanner sc = new Scanner(new File(args[0]));
            while (sc.hasNext()) {
                String word = sc.next();
                word = word.trim();

                // split all non-alphabetic characters
                String delims = "\\W+"; // split any non word
                String[] words = word.split(delims);

                // print the tokens
                for (String wordAfterTrimNonchar : words) {
                    String alpha = alphabetize(wordAfterTrimNonchar);
                    List<String> l = m.get(alpha);
                    if (l == null)
                        m.put(alpha, l=new ArrayList<String>());
                    l.add(wordAfterTrimNonchar);
                }
            }
            sc.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        System.out.println("final map: " + m);
        // Print all permutation groups above size threshold
        for (List<String> l : m.values())
            if (l.size() >= minGroupSize)
                System.out.println(l.size() + ": " + l);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}