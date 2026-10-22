# Singleton Design Pattern

## Definition
The Singleton Design Pattern ensures that a class has only one instance and provides a global access point to that instance.

## Examples
1. Basic Singleton — demonstrates a private constructor and a shared instance.
2. Configuration Manager — demonstrates shared application configuration.
3. Thread-Safe Singleton — demonstrates lazy initialization using a static holder class.

## Key Concepts
- Private constructor
- Static instance
- Global access through `getInstance()`
- Lazy vs. eager initialization
- Thread safety

## Advantages
- Controls instance creation.
- Provides a shared instance.
- Can reduce unnecessary object creation.

## Disadvantages
- Can introduce global state.
- Can make unit testing more difficult.
- Must be designed carefully for thread safety.

## How to Run
Open any demo class in IntelliJ IDEA and run its `main()` method.