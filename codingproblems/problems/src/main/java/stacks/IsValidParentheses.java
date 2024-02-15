package stacks;

import java.util.Stack;

public class IsValidParentheses {
    public static void main(String[] args) {
        String s= new String();

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(c=='(' || c== '{' || c== '['){
                stack.push(c);
            } else {
                if(!stack.isEmpty() && isMatching(stack.peek(),c)){
                    stack.pop();
                }else{
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }


    boolean isMatching(Character b ,Character c){
        if((b=='(' && c==')')|| (b=='{' && c=='}')||(b=='[' && c==']')){
            return true;
        }
        return false;

    }
}
