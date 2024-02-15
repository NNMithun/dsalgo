package strings.easy;

public class ReplaceAllDigitsWithChars {
    public static void main(String[] args) {
        String s="a1b2c3d4e";
        System.out.println(replaceDigits(s));

    }
    public static String replaceDigits(String s) {
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i <s.length()-1 ; i=i+2) {
            char c=s.charAt(i);
            int  i1= Character.getNumericValue(s.charAt(i+1));
            sb.append(shift(c,i1));
        }
        if(sb.length()<s.length()){
            sb.append(s.charAt(s.length()-1));
        }

        return sb.toString();



    }

    private static String shift(char c, int i1) {
        return  String.valueOf(c)+String.valueOf((char)(c+i1) );
    }
}
