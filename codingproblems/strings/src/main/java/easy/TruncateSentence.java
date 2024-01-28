package easy;


//Leetcode ProblemeId:1816
public class TruncateSentence {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        truncateSentence(s,4);





    }
    public static String truncateSentence(String s, int k) {
        String[] t=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(t[i]).append(" ");
        }
        return  sb.toString().trim();

    }

}
