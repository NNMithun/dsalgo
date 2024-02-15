package arrays.easy;

public class RemoveDuplicateInSortedArray2 {
    public static void main(String[] args) {

        int[] arr = { 1,1,2,2,2,3,3,3,4,4,4,4,4,5,6,6};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums) {
        int k=0;
        int count=0;
        for (int i =1; i <nums.length ; i++) {
            if(nums[i]==nums[i-1]){
                count++;
            }else {
                count=0;
            }

            if(nums[k]!=nums[i] || count<2){
                nums[++k]=nums[i];
            }
        }

        return ++k;

    }
}
