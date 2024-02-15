package strings.easy;

public class CountAsterisks {
    public static void main(String[] args) {
        String s="yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));

    }
    public static int countAsterisks(String s) {
        char[] chars= s.toCharArray();
        int barCount=0;
        int asteriskCount=0;
        for (char c:chars) {
            if(c=='|'){
                barCount++;
            }else if(barCount%2==0 && c=='*'){
                asteriskCount++;
            }
        }

        return asteriskCount;

    }
}
