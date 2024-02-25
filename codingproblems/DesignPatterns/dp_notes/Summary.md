The Gang of Four (GoF) design patterns are a set of 23 classic software design patterns originally introduced in the book "Design Patterns: Elements of Reusable Object-Oriented Software" by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides (often referred to as the "Gang of Four" or simply "GoF"). These patterns are widely used in software development to solve recurring problems and to provide solutions in a systematic and reusable way. They are categorized into three main types: creational, structural, and behavioral patterns.

1. Creational Patterns:
    - **Singleton Pattern**: Ensures that a class has only one instance and provides a global point of access to that instance.
    - **Factory Method Pattern**: Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.
    - **Abstract Factory Pattern**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
    - **Builder Pattern**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
    - **Prototype Pattern**: Creates new objects by copying an existing object, avoiding the need for costly instantiation.

2. Structural Patterns:
    - **Adapter Pattern**: Allows incompatible interfaces to work together by providing a wrapper with a compatible interface.
    - **Bridge Pattern**: Decouples an abstraction from its implementation so that the two can vary independently.
    - **Composite Pattern**: Composes objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and compositions of objects uniformly.
    - **Decorator Pattern**: Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
    - **Facade Pattern**: Provides a unified interface to a set of interfaces in a subsystem, simplifying its usage.
    - **Flyweight Pattern**: Minimizes memory usage or computational expenses by sharing as much as possible with similar objects.
    - **Proxy Pattern**: Provides a placeholder for another object to control access to it.

3. Behavioral Patterns:
    - **Chain of Responsibility Pattern**: Allows an object to pass a request along a chain of handlers until the request is handled.
    - **Command Pattern**: Encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations.
    - **Interpreter Pattern**: Defines a grammar for a language and provides an interpreter to interpret sentences in the language.
    - **Iterator Pattern**: Provides a way to access elements of an aggregate object sequentially without exposing its underlying representation.
    - **Mediator Pattern**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.
    - **Memento Pattern**: Captures and externalizes an object's internal state so that the object can be restored to this state later.
    - **Observer Pattern**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    - **State Pattern**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
    - **Strategy Pattern**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.
    - **Template Method Pattern**: Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
    - **Visitor Pattern**: Represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

These design patterns provide solutions to various common problems encountered during software development, promoting code reuse, maintainability, and scalability. However, it's essential to use them judiciously, as overusing patterns can introduce unnecessary complexity into a system.