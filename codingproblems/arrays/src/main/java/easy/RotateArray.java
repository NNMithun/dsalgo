package easy;

import java.util.*;
import java.util.stream.Stream;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        rotateArr(a, 2);


    }

    public static void rotateArr(int arr[], int d) {
        d = d % arr.length;
        d = arr.length - d;
        int temp;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int a :
                arr) {
            System.out.print(" " + a);
        }
        System.out.println(" ");
        for (int k = 0, l = d - 1; k < l; k++, l--) {
            temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
        }
        for (int k = d, l = arr.length - 1; k < l; k++, l--) {
            temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
        }
        for (int a :
                arr) {
            System.out.print(" " + a);
        }


    }

    public static void rotateArrV2(int arr[], int d) {

// TODO: 25/01/24 to improve the code from chatgpt 

    }

    public static void rotateArr_usingCollections(int arr[], int d) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(Arrays
                .stream(arr)
                .boxed()
                .toArray(Integer[]::new)));
        Collections.rotate(arrList, -d);
        arr = arrList
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        for (int a : arr) {
            System.out.print(" " + a);
        }


    }

    public static void rotateClockwise(int[] array, int steps) {
        int length = array.length;

        // Ensure non-negative steps
        steps = (steps % length + length) % length;

        reverseArray(array, 0, length - 1);
        reverseArray(array, 0, steps - 1);
        reverseArray(array, steps, length - 1);
    }

    public static void rotateCounterClockwise(int[] array, int steps) {
        int length = array.length;

        // Ensure non-negative steps
        steps = (steps % length + length) % length;

        reverseArray(array, 0, steps - 1);
        reverseArray(array, steps, length - 1);
        reverseArray(array, 0, length - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }


    /*
     * solved problem using basic array
     * solved problem using collections and streams
     * think about clockwise and anticlockwise, what simple change make it differs
     * refer chatgpt ans for to view reuse of the code
     * */

}
