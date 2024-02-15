package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] A={1, 2 ,3, 3, 4, 5, 6};
        int[] B={1, 2 , 3, 4, 5, 6};
        System.out.println(intersect(A,B));


    }
    public static int[] intersect(final int[] A, final int[] B) {
        ArrayList<Integer> intersected= new ArrayList<>();

        int i=0;
        int j=0;
        while (i<A.length && j<B.length){
            while (j< B.length && A[i]>B[j]){
                j++;
            }
            while (i< A.length && A[i]<B[j]){
                i++;
            }
            while (i<A.length && j<B.length && A[i]==B[j]){
                intersected.add(A[i]);
                i++;
                j++;
            }
        }
        int[] ab= intersected.stream().mapToInt(Integer::intValue).toArray();
        Arrays.stream(ab).forEach(a->System.out.print(a+" "));

        return ab;





    }
}
