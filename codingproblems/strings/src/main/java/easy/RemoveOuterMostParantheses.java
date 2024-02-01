package easy;

public class RemoveOuterMostParantheses {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));

    }

    //logic to detect outermost paranthesis
    //keep adding open paranthesis to stack
    //pop the 'Opening Paranthesis' when hit closing paranthesis a
    //keep doing above operation till get stack empty the prevous pop is the outer paranthesis
    //
    public static String removeOuterParentheses(String s) {
        StringBuilder result= new StringBuilder();
        int depth=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                if(depth>0){
                    result.append("(");
                }
                depth++;
            }
            else if(c==')'){
                depth--;
                if(depth>0){
                    result.append(')');
                }

            }
        }

        return result.toString();
    }
}
