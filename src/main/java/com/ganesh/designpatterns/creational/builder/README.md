# Builder Design Pattern - Simple Java Example

A beginner-friendly example of the Builder pattern in Java.

## What is the Builder Pattern?

The Builder pattern lets you create a complex object **step by step**, instead of
passing many values into one huge constructor.

Think of ordering a custom pizza: you pick the size, add cheese, add pepperoni,
and only then say "make it."

## Files

| File | Description |
|------|-------------|
| `SimpleBuilder.java` | Builds a custom `Pizza` step by step |

## How It Works

- `Pizza` has a **private constructor**, so it can only be created through its `Builder`.
- Each builder method (`size()`, `cheese()`, `pepperoni()`, `mushrooms()`) sets one
  option and returns `this`, which allows **method chaining**.
- `build()` creates and returns the final `Pizza`.

```java
Pizza p = new Pizza.Builder()
        .size("large")
        .cheese()
        .pepperoni()
        .build();
```

## Why Use It?

Without a builder, the constructor call is hard to read:

```java
new Pizza("large", true, true, false); // what does each value mean?
```

With a builder, the code explains itself:

```java
new Pizza.Builder().size("large").cheese().pepperoni().build();
```

Other benefits:
- Optional parameters: skip anything you don't want and it uses a default.
- No long, confusing constructors.
- The finished object is created in one final step with `build()`.

## How to Run

Make sure Java (JDK 8 or newer) is installed, then:

```bash
javac SimpleBuilder.java
java SimpleBuilder
```

## Expected Output

```
Pizza [size=large, cheese=true, pepperoni=true, mushrooms=false]
Pizza [size=medium, cheese=true, pepperoni=false, mushrooms=true]
```