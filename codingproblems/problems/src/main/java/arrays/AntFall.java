package arrays;

import java.util.ArrayList;
/*
We have a wooden plank of the length A units. Some ants are walking on the plank, each ant moves with speed 1 unit
per second. Some of the ants move to the left, the other move to the right.
When two ants moving in two different directions meet at some point, they change their directions and continue moving
 again. Assume changing directions doesn't take any additional time.
When an ant reaches one end of the plank at a time t, it falls out of the plank imediately.

Given an integer A and two integer arrays B signifying left going ants and C signifying right going ants, the positions
 of the ants moving to the left and the right. Return the moment when the last ant(s) fall out of the plank.
* */

public class AntFall {

    public static void main(String[] args) {

    }

    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        if (B.size() > 0) {
            max1 = B.stream().max(Integer::compare).get();
        }
        if (C.size() > 0) {
            for (int i = 0; i < C.size(); i++) {
                int val = A - C.get(i);
                if (max2 < val) {
                    max2 = val;
                }

            }

        }

        if (max1 > max2) return max1;
        else return max2;

    }

    /*To determine when the last ant falls off the plank, an intuitive approach might seem to involve
     tracking each ant's movement and interactions with other ants. However, there's a simpler way to
     view this problem that makes it much easier to solve.

  When two ants collide and seemingly change directions, you can imagine instead that they just pass
   through each other and continue moving in their original directions. This simplification works
    because the question only asks for the time when the last ant falls off the plank, not the specific
     positions of the ants at any given time. The collisions don't affect the total time it takes for all
      ants to fall off.

  Here's how to find the solution:

  Combine the positions of all ants, regardless of their initial direction.
  Calculate the time each ant will take to fall off the plank. This depends on their direction:
  For ants moving to the right, it's A - position.
  For ants moving to the left, it's simply position.
  Find the maximum of these times. This will be the moment the last ant falls off the plank.*/
    public static int timeForLastAntToFall(int A, int[] B, int[] C) {
        int maxTime = 0;

        // Loop through the ants moving to the left
        for (int leftAntPosition : B) {
            // For these ants, the time to fall off is just their position
            maxTime = Math.max(maxTime, leftAntPosition);
        }

        // Loop through the ants moving to the right
        for (int rightAntPosition : C) {
            // For these ants, the time to fall off is A - their position
            maxTime = Math.max(maxTime, A - rightAntPosition);
        }

        // The maximum of these times is when the last ant falls off
        return maxTime;
    }

}
