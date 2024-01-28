package easy;

import java.util.HashMap;

//Leetcode ProblemeId:1528
public class ShuffleString {
    public static void main(String[] args) {
        int[] indices={4,5,6,7,0,2,1,3};
        String s="codeleet";
        System.out.println(restoreString(s,indices));


    }
    public static String restoreString1(String s, int[] indices) {
        /*
        HashMap<Integer,Character> hm= new HashMap<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
        hm.put(indices[i],s.charAt(indices[i]);
        }
        for(int i=0;i<s.length();i++){
            sb.append(hm.get(i));
        }
        return s.toString();

        [4,5,6,7,0,2,1,3]
        "c o d e l e e t"

        0 1 2 3 4 5 6 7
        l e e t c o d e
        * */
        HashMap<Integer,Character> hm= new HashMap<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            hm.put(i,s.charAt(indices[i]));
        }
        for(int i=0;i<s.length();i++){
            sb.append(hm.get(i));
        }
        return sb.toString();
    }
    public static String restoreString(String s, int[] indices) {
        char[] shuffledArray= new char[s.length()];
        for (int i=0;i<s.length();i++){
            shuffledArray[indices[i]]=s.charAt(i);
        }

        return new String(shuffledArray);

    }
}
