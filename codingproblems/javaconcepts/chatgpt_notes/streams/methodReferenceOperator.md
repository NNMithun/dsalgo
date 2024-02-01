The `::` operator in Java is known as the method reference operator. It is used to refer to a method or a constructor in a concise way. Method reference is often used in the context of functional interfaces, lambda expressions, and streams. There are several forms of method references, and I'll explain some of the common ones:

1. **Reference to a Static Method:**
   - Syntax: `ClassName::staticMethodName`
   - Example:
     ```java
     // Lambda expression
     Function<Integer, String> lambda = x -> Integer.toString(x);
     
     // Method reference
     Function<Integer, String> reference = Integer::toString;
     ```

2. **Reference to an Instance Method of a Particular Object:**
   - Syntax: `object::instanceMethodName`
   - Example:
     ```java
     // Lambda expression
     String prefix = "Prefix";
     Function<String, String> lambda = s -> prefix.concat(s);
     
     // Method reference
     Function<String, String> reference = prefix::concat;
     ```

3. **Reference to an Instance Method of an Arbitrary Object of a Particular Type:**
   - Syntax: `ClassName::instanceMethodName`
   - Example:
     ```java
     // Lambda expression
     Function<String, Integer> lambda = s -> s.length();
     
     // Method reference
     Function<String, Integer> reference = String::length;
     ```

4. **Reference to a Constructor:**
   - Syntax: `ClassName::new`
   - Example:
     ```java
     // Lambda expression
     Supplier<String> lambda = () -> new String();
     
     // Method reference
     Supplier<String> reference = String::new;
     ```

The `::` operator simplifies the usage of lambda expressions, especially when the lambda body contains just a method call or constructor invocation. It provides a more concise and readable syntax, reducing boilerplate code.

It's important to note that method references are a syntactic sugar for lambda expressions, and the choice between them often depends on readability and personal preference.