package binarysearch;

public class FirstLastPositionOfElement {
    public static void main(String[] args) {
      //  int [] a={1,3,3,3,5,8};
        int [] a={1};
        int target =1;
        // int [] a={1,2,5,6};
        //int target =7;

        a=searchRange(a,target);

        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int[] range = new int[2];
        range[0]=-1;
        range[1]=-1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int temp = mid;
                while (nums[temp] == target) {
                    while (temp>=0 && nums[temp] == target) {
                        range[0] = temp;
                        temp--;
                    }
                    temp = mid;
                    while (temp<=nums.length-1 && nums[temp] == target) {
                        range[1] = temp;
                        temp++;

                    }
                    break;
                }
                break;

            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return range;

    }

}
