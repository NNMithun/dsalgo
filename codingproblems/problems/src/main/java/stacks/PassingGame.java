package stacks;

import java.util.Stack;

public class PassingGame {
    public static void main(String[] args) {
        int[] C={86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        int A=10;
        int B=23;
        System.out.println(solve(A,B,C));

    }

    public static int solve(int A, int B, int[] C) {
        Stack<Integer> stack= new Stack<>();
        stack.push(B);
        for(int i=0;i<A;i++){
            if(!stack.isEmpty() && C[i]==0){
                stack.pop();
                continue;
            }
            stack.push(C[i]);
        }

        return stack.pop();


    }
}
