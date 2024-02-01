package easy;

public class Reversewords {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));;


    }
    public static String reverseWords(String s) {
        String[] strArray= s.split(" ");
        StringBuilder stringBuilder= new StringBuilder();
        for (String s1:
             strArray) {
            stringBuilder.append(new StringBuilder(s1).reverse()).append(" ");
        }
        return stringBuilder.toString().trim();

    }
}
