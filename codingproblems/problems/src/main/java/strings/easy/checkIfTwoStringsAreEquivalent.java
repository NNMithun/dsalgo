package strings.easy;

import java.util.Arrays;

//Leetcode ProblemeId:1662
public class checkIfTwoStringsAreEquivalent {
    public static void main(String[] args) {
       String[] word1 = {"ab", "c","d"};
       String[] word2 = {"ab", "c","de"};
        System.out.println(arrayStringsAreEqual(word1,word2));;


    }
    /*Constraints:
1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
*/

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /*
        -comparing array length gives incorrect result
        -if totalStringLengths are not equal return false
        -else compare each string char by char if mismatched return false
        -else true
        * */

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        Arrays.stream(word1).forEach(s->sb1.append(s));
        Arrays.stream(word2).forEach(s->sb2.append(s));
        if (sb1.length()!=sb2.length())return false;
        else {
            int i=0;
            while (i<sb1.length()){
                if(sb1.charAt(i)!=sb2.charAt(i)){return false;}
                i++;
            }
        }

        return true;

    }

}
