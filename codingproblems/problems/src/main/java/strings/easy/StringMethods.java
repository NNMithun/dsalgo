package strings.easy;

public class StringMethods {
    public static void main(String[] args) {
        String s="Mithun1";
        //Returns: a string whose value is this string, with all leading and trailing white space removed
        s.strip();
        s.substring(0,5);
        //System.out.println(s.contains("nu"));;

        //can bit manupulation cannot be applied on Strings

        int a=1;
        int b=2;
        int c=     a|b;

        String d="1";
        String e="1";
      //  String f= d|e;

        char g='1';
        char h='1';
        int i=g|h;
        int count=0;

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 5; k++) {
                if(k>1)
                break;
            }
            count++;

        }
        //System.out.println(count);
        String m2="mithuni";
        System.out.println(m2.substring(0, m2.lastIndexOf('i')));

        System.out.println(new StringBuilder(s.substring(0,s.lastIndexOf('i'))).reverse().append(s.substring(s.lastIndexOf("i",s.length()))));;
        //System.out.println(m2.replaceAll("i",""));


    }
}
