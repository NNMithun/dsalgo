package easy;

import java.util.ArrayList;
import java.util.List;
//Leetcode ProblemeId:2194
public class CellsInRangeOnExcelSheet {
    public static void main(String[] args) {
        String r1 = "A1:Z10";
        cellsInRange(r1);

    }

    public static List<String> cellsInRange(String s) {
        List<String> str = new ArrayList<>();
        String[] s1 = s.split(":");
        String rangeStart = s1[0];
        String rangeEnd = s1[1];

        char col1 = rangeStart.charAt(0);
        int row1 = Integer.valueOf(rangeStart.substring(1));
        char col2 = rangeEnd.charAt(0);
        int row2 = Integer.valueOf(rangeEnd.substring(1));
        int r1 = row1;
        int r2 = row2;

        while (col2 >= col1) {
            while (r2 >= r1) {
                String s2 = String.valueOf(col1) + r1;
                str.add(s2);
                r1++;
            }
            r1 = row1;
            col1 = (char) (col1 + 1);
        }
        return str;

    }
    /*
        Important learning while solving this problem
        -concatenate of char and number by simple examples to understand
        -it was taking ASCII value if I use the + operator,   (int)('1'+1)
        -can I put If or while condition on char -->if('char1'>'char2')
        -how to get numeric value of char--> Character.getNumericValue(char)

    * */
}
