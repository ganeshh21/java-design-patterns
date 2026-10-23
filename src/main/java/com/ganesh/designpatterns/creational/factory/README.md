The Factory pattern means you don’t create objects yourself with new. Instead, you ask a “factory” to create them for you.

Simple analogy: When you order a pizza, you just say “I want a Margherita.” You don’t go into the kitchen and make the dough, sauce, and toppings yourself. The kitchen (the factory) does that and hands you the finished pizza.

In code:

Without a factory: new Circle(5), new Square(3), and so on. Your code must know every class.
With a factory: ShapeFactory.create("circle", 5). Your code only knows the name and gets back a Shape.

Why it’s useful:

Less coupling. The client doesn’t depend on the concrete classes.
Easy to extend. To add a new shape, you change the factory and leave the client code alone.
One place for creation logic. If building an object gets complicated, that logic lives in one spot.

One-line definition: the Factory pattern puts object creation in one place, so the rest of your code can ask for what it needs without caring how it’s built.