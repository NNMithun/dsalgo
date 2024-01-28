package easy;

import java.util.HashSet;

//Leetcode ProblemeId:1832
public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsov";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (!h.contains(sentence.charAt(i))) {
                h.add(sentence.charAt(i));
                if (h.size() == 26) return true;
            }
        }

        return false;
    }
}

        /*
    for sure
    first we should have a checklist of all lowercase char and set

    */
