package easy;

public class MaxDepthOfParanthesis {
    public static void main(String[] args) {
        String s="(1)+((2))+((((3))))";
        System.out.println(maxDepth(s));


    }
    public static int maxDepth(String s) {
        char[] chars= s.toCharArray();
        int depth=0;
        int maxDepth=0;
        for (char c:chars){
            if(c=='('){
                depth++;
                maxDepth=Math.max(maxDepth,depth);
            }
            if (c==')'){
                depth--;
            }
        }
        return maxDepth;


    }
}
