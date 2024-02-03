package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1,1,2};
        int[] arr1 = { 1,1,2};
        int val = 3;
        removeDuplicates(arr);

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
}
