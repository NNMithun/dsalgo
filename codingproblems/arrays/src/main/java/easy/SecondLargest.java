package easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {

    }

    int print2largest_naivemethod(int arr[], int n) {
      return   Arrays.stream(arr)
              .boxed()  // Convert to Integer stream
              .distinct()  // Remove duplicates
              .sorted((a, b) -> Integer.compare(b, a))  // Sort in descending order
              .skip(1)  // Skip the first element (largest)
              .findFirst()
              .orElse(-1);




    }

}
