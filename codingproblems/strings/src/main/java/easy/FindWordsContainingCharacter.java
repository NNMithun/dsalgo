package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char s = 'k';
        List<Integer> indices =findWordsContaining(words, s);
        indices.stream().forEach(a-> System.out.print(" "+a));



    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indicesOfwords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                indicesOfwords.add(i);
            }
        }
        return indicesOfwords;

    }
}
