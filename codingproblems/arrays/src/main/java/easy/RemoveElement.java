package easy;

import java.util.ArrayList;
import java.util.Arrays;

//27. Remove Element
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        removeElement(arr, val);


    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        ArrayList index = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                count++;
                index.add(i);
            }
        }
        int j = 0;

       int count1=count;
        for (int i = (nums.length-1); i >=0; i--) {

            if (count>0 && nums[i]!=-1){
                nums[(int)index.get(j)]=nums[i];
                nums[i]=-1;
                j++;
            }
            count--;
        }

        Arrays.stream(nums).forEach(System.out::println);

       /* for (int i = (nums.length - 1); i >= 0; i--) {
            if (count != 0) {
                if (nums[i] == -1) {
                    count--;
                } else {
                    nums[(int) index.get(j)] = nums[i];
                    nums[i] = -1;
                }
            }
        }*/

        return nums.length - count1;
    }
    public static int removeElement1(int[] nums, int val) {
        int k = 0; // Pointer for keeping track of the position for non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not equal to val, move it to the position k
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
