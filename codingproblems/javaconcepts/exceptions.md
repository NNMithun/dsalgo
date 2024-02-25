In Java, exceptions are divided into two main categories: checked and unchecked exceptions.

1. Checked Exceptions: These are the exceptions that are checked at compile-time. If a method throws a checked exception, it must either handle the exception using a try-catch block or it must declare the exception, i.e., the method must use the `throws` keyword to let the caller know about the exception. Examples of checked exceptions include `IOException`, `ClassNotFoundException`, etc.

2. Unchecked Exceptions: These are the exceptions that are checked at runtime, not at compile-time. In other words, the compiler doesn't force you to either handle or declare these exceptions. Unchecked exceptions are subclasses of `RuntimeException`, and they include `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`, etc.

Here's a simple example to illustrate the difference:

```java
// Example of a checked exception
public void readFromFile(String fileName) throws IOException {
    // If the file does not exist, an IOException is thrown
    FileReader file = new FileReader(fileName);
}

// Example of an unchecked exception
public void divideByZero() {
    // This will throw an ArithmeticException (an unchecked exception) at runtime
    int result = 10 / 0;
}
```

In the first method, `readFromFile`, we're forced to either handle the `IOException` or declare it using the `throws` keyword. In the second method, `divideByZero`, we're not forced to do anything with the `ArithmeticException`. However, if we don't handle it, our program will crash at runtime.