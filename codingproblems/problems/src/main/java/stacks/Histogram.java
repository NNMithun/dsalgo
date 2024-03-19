package stacks;

import java.util.Stack;


/*
https://leetcode.com/problems/largest-rectangle-in-histogram/description/
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
 return the area of the largest rectangle in the histogram.
* */

public class Histogram {

    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};
        //int[] histogram = {10,9,8,7,6,5,4,3,2};
//        System.out.println("The area of the largest rectangle is: " + largestRectangleArea(histogram));
        System.out.println("The area of the largest rectangle is: " + largestRectangleArea_sout(histogram));
    }

    /*
   logic is
    1. keep iterating from left to right till elements in the ascending order
       in other words, as the continuity of rectanlge to form
    2. and also keep pushing the index of elements to stack till continuity breaks
    3. pop the index and calculate the area such the area

   this problem is also kind of  two pointer
   1. 1st pointer is of stack-top(which stores the lowerlimit index)
   2. 2nd pointer is of loop-i(which stores the upper limit index)

    */

    public static int largestRectangleArea(int[] A) {
        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;
        int n = A.length;
        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : A[i]);
            if (stack.isEmpty() || h >= A[stack.peek()]) {
                stack.push(i);
            } else {
                int tp = stack.pop();
                maxArea = Math.max(maxArea, A[tp] * (stack.isEmpty() ? i : i - 1 - stack.peek()));

                i--;
            }
        }

        return maxArea;
    }

    public static int largestRectangleArea_sout(int[] A) {
        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;
        int n = A.length;
        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : A[i]);
            if (stack.isEmpty() || h >= A[stack.peek()]) {
                stack.push(i);
            } else {
                int tp = stack.pop();
                maxArea = Math.max(maxArea, A[tp] * (stack.isEmpty() ? i : i - 1 - stack.peek()));
                i--;
            }
        }

        return maxArea;
    }

}
