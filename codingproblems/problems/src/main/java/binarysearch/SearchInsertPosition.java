package binarysearch;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
* */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 8};
        int target = 2;
        // int [] a={1,2,5,6};
        //int target =7;
        System.out.println(searchInsert(a, target));
        ;

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int p = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                p = mid - 1;
            } else {
                right = mid - 1;
                p = mid + 1;
            }
        }

        return mid;

    }
}
