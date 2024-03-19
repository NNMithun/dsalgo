package stacks.InArrayDistance;
/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.



Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]


Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100*/

import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {

    }
    int[] risingTemp(int[] temperatures){
        //
        int[] answer= new int[temperatures.length];
        int n=temperatures.length;
        int count=1;
        int j=0;
        for(int i=0;i<n;i++){
            j=i+1;
            while(j<n && temperatures[i]>=temperatures[j]){
                count++;
                j++;
            }
            if(j==n){
                count=0;
            }
            answer[i]=count;
            count=1;
        }
        return answer;



    }
/*
You will forget this logic bit difficult visualize
idea is to figure out LIFO operation in this problem.
I cant come up with solution, I have to by heart

1.  Problem trickle downs to calculate the distance between two index
2.  we need two pointers, in that "i"-->final point and stack
    which holds the index of initial point.
3.  will keep pushing elements as long as  this condition fails
    A[i]>A[s.peek()]
4.  once this condition is true, will keep pop the element as long as
    condition is true and
    calculate the distance getting difference between two indexes
*/
    int[] dailyTempStack(int[] temperatures){
        int len=temperatures.length;
        int[] ans=new  int[len];
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<len;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                int idx= st.pop();
                ans[idx]= i-idx;
            }
            st.push(i);
        }
        return ans;
    }

}
