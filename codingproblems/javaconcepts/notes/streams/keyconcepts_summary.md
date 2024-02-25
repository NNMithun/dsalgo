# Streams in Java

In Java, streams provide a new abstraction for working with sequences of elements. Introduced in Java 8 as part of the `java.util.stream` package, streams offer a functional and declarative way to process collections of data. Streams are designed to work with collections, allowing developers to express computations more concisely and to parallelize operations easily.

## Key Concepts and Features

1. **Stream Creation:**
   - Streams can be created from various data sources, such as collections, arrays, I/O channels, and generator functions.
   - Common methods for creating streams include `Collection.stream()`, `Arrays.stream()`, and `Stream.of()`.

2. **Functional Operations:**
   - Streams support functional-style operations on data, allowing you to perform transformations, filters, and aggregations.
   - Common operations include `map`, `filter`, `distinct`, `sorted`, `flatMap`, and more.

3. **Intermediate and Terminal Operations:**
   - Operations on streams can be categorized into two types: intermediate and terminal.
   - Intermediate operations (e.g., `map`, `filter`) transform a stream into another stream and return a new stream.
   - Terminal operations (e.g., `forEach`, `collect`, `reduce`) produce a result or side effect and close the stream.

4. **Laziness and Short-circuiting:**
   - Streams are lazy, meaning intermediate operations are only executed when a terminal operation is invoked.
   - Short-circuiting operations, like `findFirst` and `limit`, allow stopping the processing of the stream once a certain condition is met.

5. **Parallel Streams:**
   - One of the significant advantages of streams is their support for parallel processing.
   - You can easily convert a sequential stream into a parallel stream using the `parallel()` method, and vice versa using `sequential()`.

6. **Reduction Operations:**
   - Terminal operations like `reduce` allow you to perform aggregations on the elements of the stream, such as summing, finding the maximum or minimum, etc.

7. **Collectors:**
   - The `collect` method is a terminal operation that transforms the elements of a stream into a different form, usually a collection like a List, Set, or Map.
   - Java provides a set of predefined collectors in the `Collectors` utility class.

8. **Optional Class:**
   - Streams often return `Optional` objects to handle the possibility of a result not being present.
   - This helps to avoid `NullPointerExceptions` and provides a more expressive way to deal with potentially absent values.

## Example

Here's a simple example illustrating the use of streams to find the sum of squared even numbers from a list:

```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquares = numbers.stream()
                                  .filter(n -> n % 2 == 0)
                                  .map(n -> n * n)
                                  .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}
