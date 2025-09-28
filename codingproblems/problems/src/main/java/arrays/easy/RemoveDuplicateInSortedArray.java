package arrays.easy;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1,1,2};
        int[] arr1 = { 1,1,2};
        int val = 3;

        removeDuplicates1(arr);

    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        for (int i =0; i <nums.length ; i++) {
            if(nums[k]!=nums[i]){
                nums[++k]=nums[i];
            }
        }
        Arrays.stream(nums).forEach(a->System.out.print(" "+a));
        System.out.println();
        System.out.println(++k);
        return k;

    }
    public static int removeDuplicates1(int[] nums) {
        int i = 1;
        int j = 0;
        while (i < nums.length) {
            if (nums[j] == nums[i]) {
                i++;
            } else {
                j++;
                nums[j] = nums[i];
                i++;

            }

        }
        return j++;
    }


}
