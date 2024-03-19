Sure, let's take the example of a simple payment processing system to illustrate the Open/Closed Principle (OCP) using Java. We want our payment system to be extendable so that we can add support for new payment methods without altering the existing codebase.

### Step 1: Define the Payment Strategy Interface

First, we define a `PaymentStrategy` interface with a method `processPayment` that all concrete payment strategies will implement.

```java
public interface PaymentStrategy {
    void processPayment(double amount);
}
```

### Step 2: Implement Concrete Strategies

Next, we implement concrete strategies for different payment methods. Here, we'll create two: one for credit card payments and another for PayPal payments.

**CreditCardPaymentStrategy.java**

```java
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of $" + amount);
    }
}
```

**PayPalPaymentStrategy.java**

```java
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
```

### Step 3: Payment Processor Class

Now, we create a `PaymentProcessor` class that uses a `PaymentStrategy` to process payments. This class is designed according to OCP and does not need to change when new payment methods are added.

```java
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
```

### Step 4: Using the Payment System

Here's how you might use the system to process different types of payments:

```java
public class PaymentSystemDemo {
    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new PaymentProcessor(new CreditCardPaymentStrategy());
        creditCardPayment.process(100.0);

        PaymentProcessor payPalPayment = new PaymentProcessor(new PayPalPaymentStrategy());
        payPalPayment.process(200.0);
    }
}
```

In this example, if we want to introduce a new payment method (e.g., Bitcoin), we can simply create a new class that implements the `PaymentStrategy` interface without modifying any of the existing classes. This approach adheres to the Open/Closed Principle, promoting a design that is easy to extend and maintain.

**BitcoinPaymentStrategy.java** (New Payment Method Example)

```java
public class BitcoinPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Logic to process Bitcoin payment
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}
```

Adding this new payment method doesn't require any changes to the existing `PaymentProcessor` class or the `PaymentStrategy` interface, demonstrating the system's adherence to the OCP.