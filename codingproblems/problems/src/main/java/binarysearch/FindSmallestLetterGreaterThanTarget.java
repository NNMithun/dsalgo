package binarysearch;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] c={'c','f','j','z'};
        char target='y';
        System.out.println(nextGreatestLetter(c,target));


    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        int mid= start+ (end-start)/2;

        while(start<end){
            if (letters[mid]>=target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }


        //as long as start is lesser than the end,
        //compare the mid char is greater than target
        //compare the mid char is lesser than target




    }
}
