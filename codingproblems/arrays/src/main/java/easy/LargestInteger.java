package easy;

import java.util.Arrays;

public class LargestInteger {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        System.out.println(largest_method1(a));
        System.out.println(largest_method2(a));

    }

    public static int largest_method1(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }
    public static int largest_method2(int[] array) {
        return (Integer) Arrays
                .stream(array)
                .max()
                .getAsInt();
    }
}
