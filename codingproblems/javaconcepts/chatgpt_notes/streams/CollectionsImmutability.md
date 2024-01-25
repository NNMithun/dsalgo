In Java, the `Collections` utility class provides various static methods to work with collections. When it comes to immutability, it's essential to differentiate between the interfaces in the `java.util` package and their corresponding implementations.

### Immutable Interfaces:

1. **`List` Interface:**
   - `List` interface itself does not guarantee immutability.
   - However, there is an immutable list implementation called `List.of()` introduced in Java 9:
     ```java
     List<String> immutableList = List.of("A", "B", "C");
     ```

2. **`Set` Interface:**
   - Similar to `List`, `Set` interface itself does not guarantee immutability.
   - `Set.of()` creates an immutable set starting from Java 9:
     ```java
     Set<String> immutableSet = Set.of("X", "Y", "Z");
     ```

3. **`Map` Interface:**
   - `Map` interface itself does not guarantee immutability.
   - `Map.of()` creates an immutable map starting from Java 9:
     ```java
     Map<String, Integer> immutableMap = Map.of("one", 1, "two", 2, "three", 3);
     ```

### Immutable Implementations:

1. **`Collections.unmodifiableList`:**
   - This method returns an unmodifiable view of the specified list:
     ```java
     List<String> originalList = new ArrayList<>();
     List<String> unmodifiableList = Collections.unmodifiableList(originalList);
     ```

2. **`Collections.unmodifiableSet`:**
   - Similar to `unmodifiableList`, this method returns an unmodifiable view of the specified set.

3. **`Collections.unmodifiableMap`:**
   - This method returns an unmodifiable view of the specified map.

### Mutable Implementations:

1. **`ArrayList`:**
   - `ArrayList` is a mutable implementation of the `List` interface.

2. **`LinkedList`:**
   - `LinkedList` is another mutable implementation of the `List` interface.

3. **`HashSet`:**
   - `HashSet` is a mutable implementation of the `Set` interface.

4. **`HashMap`:**
   - `HashMap` is a mutable implementation of the `Map` interface.

### Tips:

- The immutable implementations (`List.of()`, `Set.of()`, `Map.of()`) introduced in Java 9 and later provide a concise way to create immutable collections.
- The `unmodifiable` wrappers (`Collections.unmodifiableList`, `Collections.unmodifiableSet`, `Collections.unmodifiableMap`) create views of existing collections, making them unmodifiable. The underlying original collections can still be modified.

It's important to choose the appropriate implementation based on your requirements for immutability and mutability. Always consider the thread safety and performance implications when selecting a collection implementation.