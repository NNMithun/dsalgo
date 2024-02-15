package strings.easy;

import java.util.stream.Collectors;

public class MissingCharsInString {
    public static void main(String[] args) {
        String str= "abcd";
        System.out.println(missingChars_usingStreams(str));

    }

    public static String missingChars(String s){
        int[] alphabetFrequency= new int[26];
        StringBuilder sb= new StringBuilder();
        char[] chars= s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           alphabetFrequency[chars[i]-'a']=1;
        }
        for (int i = 0; i < alphabetFrequency.length; i++) {
            if(alphabetFrequency[i]==0){
            sb.append((char) (i+'a'));
            }

        }
        return sb.toString();




    }
    public static String missingChars_usingStreams(String input){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String missingChars = alphabet.chars()
                                      .filter(ch -> !input.toLowerCase().contains(String.valueOf((char) ch)))
                                      .mapToObj(ch -> String.valueOf((char) ch))
                                      .collect(Collectors.joining());

        return missingChars;




    }
}
