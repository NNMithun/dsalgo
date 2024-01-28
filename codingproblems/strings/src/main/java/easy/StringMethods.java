package easy;

public class StringMethods {
    public static void main(String[] args) {
        String s="Mithun1";
        //Returns: a string whose value is this string, with all leading and trailing white space removed
        s.strip();
        s.substring(0,5);
        System.out.println(s.contains("nu"));;

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
        System.out.println(count);


    }
}
