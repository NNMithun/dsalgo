package arrays.easy;
//kadane's algorithm
public class MajorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=1;

        for (int i = 1; i < nums.length; i++) {
            if (count==0){
                candidate=nums[i];
            }
            count+=nums[i]==candidate?1:-1;
        }
    return candidate;

    }
}
