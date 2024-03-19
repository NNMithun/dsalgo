package stacks;

import java.util.Stack;

public class IsValidParentheses {
    public static void main(String[] args) {
        String s = new String();

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && isMatching(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }


    boolean isMatching(Character b, Character c) {
        if ((b == '(' && c == ')') || (b == '{' && c == '}') || (b == '[' && c == ']')) {
            return true;
        }
        return false;

    }

    public boolean isValidrevise(String s) {
        Stack<Character> st = new Stack<>();
        char co = '(';
        char fo = '{';
        char so = '[';
        char cc = ')';
        char fc = '}';
        char sc = ']';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == co || s.charAt(i) == fo || s.charAt(i) == so) {
                st.push(s.charAt(i));
            } else if (!st.isEmpty() &&
                    (s.charAt(i) == cc && st.peek() == co
                            || s.charAt(i) == fc && st.peek() == fo
                            || s.charAt(i) == sc && st.peek() == so)) {
                st.pop();

            } else {
                return false;
            }
        }
        return true;


    }
}
