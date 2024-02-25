The expression `ArrayList::new` is a method reference in Java. Specifically, it refers to the constructor of the `ArrayList` class. This is often used in the context of the `collect` method on a stream to create a new instance of a collection.

Let's break down the usage of `ArrayList::new` in the context of `collect`:

```java
List<Integer> result = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
```

Here's what each part of this expression does:

1. **`ArrayList::new` (Supplier)**:
   - This is a method reference to the constructor of the `ArrayList` class. In the context of `collect`, it serves as a `Supplier` that provides a new, empty `ArrayList` instance.

2. **`ArrayList::add` (BiConsumer)**:
   - This is another method reference, referring to the `add` method of the `ArrayList` class. It's used as a `BiConsumer` to add each element of the stream to the `ArrayList` as it is processed.

3. **`ArrayList::addAll` (BiConsumer)**:
   - Like the `add` method, this is a method reference to the `addAll` method of the `ArrayList` class. It is used as a `BiConsumer` to combine the results in case of parallel streams. When the results of different threads are combined, this method is responsible for merging the contents of two `ArrayLists`.

So, when you use `ArrayList::new` in the `collect` method, it essentially tells Java to create a new `ArrayList` for each element in the stream, add the element using `ArrayList::add`, and merge the results using `ArrayList::addAll` when needed.

This pattern is common when you want to collect elements from a stream into a mutable collection like `ArrayList`. It's concise and leverages the power of method references to make the code more readable.