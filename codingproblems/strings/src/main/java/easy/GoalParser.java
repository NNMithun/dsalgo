package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoalParser {
    public static void main(String[] args) {

        String s = interpret("()()()G()(al)(al)");

        System.out.println(s);

    }

    public static String interpret(String command) {
        //we have to find this charset in the string
        // "G", "()","(al)"
        /*

        stringBuilder sb= new StringBuilder();

        while(i<command.length){
        if(command.charAt(i)=='G')
        sb.append('G') ;continue;
        else if(command.charAt(i)=='(' && i+1<command.length && command.charAt(i+1)==')'){
        sb.append(o)
        i=i+2
        }
        else{
        sb.append(al)
        i=i+4;
        }}
        */

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
                i = i + 1;
                continue;
            } else if (command.charAt(i) == '(' && i + 1 < command.length() && command.charAt(i + 1) == ')') {
                sb.append("o");
                i = i + 2;
                continue;
            } else {
                sb.append("al");
                i = i + 4;
            }
        }

        return sb.toString();

    }
}
