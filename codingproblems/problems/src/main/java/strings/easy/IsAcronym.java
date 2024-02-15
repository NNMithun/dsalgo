package strings.easy;

import java.util.Arrays;
import java.util.List;

public class IsAcronym {
    public static void main(String[] args) {

       List<String> ls= Arrays.asList("alice","bob","charlie");
        String b="abc";
        System.out.println(isAcronym(ls,b));;


    }
    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder sb= new StringBuilder();
        for(String word: words){
            sb.append(word.charAt(0));
        }

        if(sb.toString().equals(s)){
            return true;
        }

        return false;
    }
}
