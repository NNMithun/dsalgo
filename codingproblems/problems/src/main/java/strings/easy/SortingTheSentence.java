package strings.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//leetcode problemId:1859. Sorting the Sentence
//this problem is similar to  shuffleString
//String Usecase: get the lastIndexChar of a String,
//->get the numeric of it
public class SortingTheSentence {
    public static void main(String[] args) {
        String str = "sentence4 a3 is2 This1";
        //System.out.println(sortSentence(str));
        System.out.println(reconstructOriginalSentence(str));
        ;

    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split(" ");
        int strlength = s1.length;
        String[] s2 = new String[strlength];
        for (int i = 0; i < strlength; i++) {
            int j = Character.getNumericValue(s1[i].charAt(s1[i].length() - 1));
            s2[j - 1] = s1[i].substring(0, s1[i].length() - 1);
        }

        for (String s3 : s2) {
            sb
                    .append(s3)
                    .append(" ");
        }
        return sb
                .toString()
                .strip();
    }

    public static String reconstructOriginalSentence(String shuffledSentence) {
        // Split the shuffled sentence into words
        String[] words = shuffledSentence.split(" ");

        // Extract word and index, then sort based on index
        String originalSentence = Arrays
                .stream(words)
                .map(word -> new String[]{word.substring(0, word.length() - 1), word.substring(word.length() - 1)})
                .sorted(Comparator.comparing(wordWithIndex -> Integer.parseInt(wordWithIndex[1])))
                .map(wordWithIndex -> wordWithIndex[0])
                .collect(Collectors.joining(" "));


     //  Long num= Arrays.stream(words).map(word->new String[]{word.substring(0,word.length()-1)}).sorted().collect(Collectors.counting());


        return originalSentence;
    }

}
