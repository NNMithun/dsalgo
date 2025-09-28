package strings.easy;

public class ZigzagConversion {

    public static void main(String[] args) {

       String s= zigzagconversion("PAYPALISHIRING",4);
        System.out.println(s);
    }

    private static String zigzagconversion(String word, int no_of_rows){

        StringBuilder [] rows= new StringBuilder[no_of_rows];
        StringBuilder res= new StringBuilder();
        boolean goingDown= false;
        int curr_row=0;


        if (no_of_rows == 1 || no_of_rows >= word.length()) {
            return word;
        }
        for (int i = 0; i < no_of_rows; i++) {
            rows[i] = new StringBuilder();
        }

        for(char c: word.toCharArray()){
        rows[curr_row].append(c);
        if(curr_row==0||curr_row==no_of_rows-1){
            goingDown=!goingDown;
        }

        curr_row+=goingDown?1:-1;

        }

        for (StringBuilder row: rows){
            res.append(row);
        }

        return res.toString();




    }
}
