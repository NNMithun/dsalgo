package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {


    public static void main(String[] args) {
        int[] candidates = {1, 2,3,4,5, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
        // Output: [[2, 2, 3], [7]]
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, result, new ArrayList<>(), 0, 0);
        return result;
    }

    private static void backtrack(int[] candidates, int target, List<List<Integer>> result,
                                  List<Integer> current, int start, int sum) {
        // If the current sum equals the target, add the current combination to the result
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If the sum exceeds the target, stop exploring this path
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Add the candidate to the current combination
            current.add(candidates[i]);
            // Recursively try next numbers with the new sum, allowing the same number to be reused
            backtrack(candidates, target, result, current, i, sum + candidates[i]);
            // Backtrack by removing the last added number
            current.remove(current.size() - 1);
        }
    }
}


