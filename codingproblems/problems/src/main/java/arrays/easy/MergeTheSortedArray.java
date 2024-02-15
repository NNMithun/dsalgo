package arrays.easy;

import java.util.Arrays;

//leetcode:88. Merge Sorted Array
public class MergeTheSortedArray {
    public static void main(String[] args) {
        int [] nums1={0,1,2,3,0,0,0,0,0};
        int [] nums2={2,5,6,9,9};
        mergeSortedArray(nums1,nums2,nums1.length-nums2.length,nums2.length);


    }

    // first attempt
    // What I didnt think through: I wrote 3 conditions >, < and ==, to handle duplicate numbers but actually it
    // was taken care by 2 condition it self I should have visualize better way
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //
        int i=0;
        int j=0;
        int k=0;
        int[] nums3=new int[m+n];

        while(i<m && nums1[i]!=0 && j<n){
            if(nums1[i]>nums2[j]){
                nums3[k]=nums2[j];
                j++;

            } else if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }else {
                nums3[k]=nums1[i];
                k=k+1;
                nums3[k]=nums2[j];
                i++;
                j++;
            }
            k++;
        }

        if(i>=m){
            for (int l = j; l < n; l++) {
                nums3[k++]=nums2[l];
            }
        }else{
            for (int l = i; l < m; l++) {
                nums3[k++]=nums1[l];
            }
        }

        for (int l = 0; l <k; l++) {
            nums1[l]=nums3[l];
            //System.out.print (" "+nums1[l]);
            System.out.println();
            System.out.print (" "+nums3[l]);
        }
    }

    //chatgpt sol
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        // Resultant array to hold the merged result
        int[] result = new int[array1.length + array2.length];

        // Indices for array1, array2, and result
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and compare each element
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                // If current element of array1 is smaller or equal, add it to result
                result[k++] = array1[i++];
            } else {
                // If current element of array2 is smaller, add it to result
                result[k++] = array2[j++];
            }
        }

        // If there are remaining elements in array1, add them to result
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        // If there are remaining elements in array2, add them to result
        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }


    public static void  mergeSortedArray(int[] arr1, int[] arr2, int m ,int n){

        // pointer to ends of nums1 length
        int p1=m-1;
        // pointer to ends of nums2 length
        int p2=n-1;
        //pointer to end of nums1
        int p=m+n-1;

        while (p1>=0 && p2>=0){
           if (arr1[p1]>arr2[p2]){
               arr1[p--]=arr1[p1--];
           }else {
               arr1[p--]=arr2[p2--];
           }
        }

        while(p2>=0){
            arr1[p--]=arr2[p2--];
        }

        Arrays.stream(arr1).forEach(a->System.out.print(" "+a));

    }




}
