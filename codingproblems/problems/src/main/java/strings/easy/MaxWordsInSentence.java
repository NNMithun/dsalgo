package strings.easy;
//Leetcode ProblemeId:2114
public class MaxWordsInSentence {
    public static void main(String[] args) {
        String s="alice and bob love leetcode";
        String[] sa={"alice and bob love leetcode","a b c d e f g"};
        System.out.println(mostWordsFound(sa));

    }

    public static int mostWordsFound(String[] sentences) {

       int maxCount=0;
       for(String s:sentences)
       {  int count=(s.split(" ").length);
            if(count>maxCount)
            maxCount=count;
       }
       return maxCount;



    }
}
