The two lines you provided use different methods to create a stream from an array:

1. **Arrays.stream(arr).forEach(x -> System.out.println(x));**
   - This line uses `Arrays.stream(arr)` to create an `IntStream` (or a `DoubleStream` or `LongStream` based on the type of elements in the array) and then calls `forEach` on the stream to print each element.

2. **Stream.of(arr).forEach(x -> System.out.println(x));**
   - This line uses `Stream.of(arr)` to create a stream of the array elements and then calls `forEach` on the stream to print each element.

In the context of printing array elements, both approaches will yield the same result. However, there are a few differences between the two:

- **Type of Stream Created:**
  - `Arrays.stream(arr)` creates a specialized stream (`IntStream`, `DoubleStream`, or `LongStream`), which can be useful if you need to perform numeric operations on the stream elements.
  - `Stream.of(arr)` creates a more generic `Stream<Object>` regardless of the type of elements in the array.

- **Use Case:**
  - If you are working with primitive data types (int, double, long), `Arrays.stream(arr)` might be more convenient as it provides specialized methods for numeric operations.
  - If you are working with objects and want a generic stream, `Stream.of(arr)` is more suitable.

Here's an example demonstrating the difference:

```java
public class StreamExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Using Arrays.stream
        System.out.println("Using Arrays.stream:");
        Arrays.stream(arr).forEach(x -> System.out.println(x));

        // Using Stream.of
        System.out.println("\nUsing Stream.of:");
        Stream.of(arr).forEach(x -> System.out.println(x));
    }
}
```

In the example above, both approaches will produce the same output. Choose the method that best fits your use case and the type of elements in your array.