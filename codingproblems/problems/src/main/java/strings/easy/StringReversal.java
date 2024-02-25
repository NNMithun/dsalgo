package strings.easy;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(String.valueOf(reverseSentenceKeepingSpace("I love my india")));

        /*String s= "mithun";
        char[] cs= s.toCharArray();
        cs[0]='a';
        cs[1]='b';

        System.out.println(s);
        Stream.of(cs).forEach(c-> System.out.print(c));
*/    }

    //my name is arya
    //ay rasi em anym
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        char[] chars = str.toCharArray();
        ArrayList<Integer> spaceIndex = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                spaceIndex.add(i);
            } else {
                sb.append(str.charAt(i));
            }
        }


        int j=0;
        int i=0;
        while(i<str.length() && j<sb.length()){
            if(str.charAt(i)!=' '){
                str=str.replace(str.charAt(i),sb.charAt(j));
                j++;
            }
            i++;
        }


        return str;



    }

    public  static String reverseSentenceKeepingSpace(String str){
        char[] chars= str.toCharArray();
        int i=0;
        int j= chars.length-1;
        while (i<j){
            if (chars[i]==' ')i++;
            if (chars[j]==' ')j--;
            char c= chars[i];
            chars[i]=chars[j];
            chars[j]=c;
            i++;
            j--;
        }
        String s= new String(chars);
        return s;


    }


}
