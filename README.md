

---

# Java Stream API Examples — Filter and Reduce

## Description

This project demonstrates the use of **Java Stream API** with two common operations:

* **Filtering** a collection based on a condition.
* **Reducing** a collection to a single value such as sum or max.

It highlights functional programming concepts in Java 8+ using streams, lambda expressions, and method references.

---

## Part 1: Stream Filter Example

### Features

* Creates a list of fruits.
* Prints all fruits using `forEach` with an anonymous inner class.
* Uses `stream().filter()` to select fruits ending with the letter 'e'.
* Prints filtered fruits using method reference.

### Code Structure

* `filter` class with `main` method demonstrating stream filtering.

### How to Run

1. Compile the class:

   ```bash
   javac Concepts/Stream/filter.java
   ```

2. Run the program:

   ```bash
   java Concepts.Stream.filter
   ```

### Sample Output

```
Printing Fruits using a stream

apple
banana
orange
mango
pineapple
cherry

Printing Fruits using a filter
apple
orange
pineapple
```

---

## Part 2: Stream Reduce Example

### Features

* Creates a list of integers.
* Uses `reduce` method to compute:

  * Sum using anonymous inner class.
  * Sum using lambda expression.
  * Maximum value using lambda expression.

### Code Structure

* `reduce` class with `main` method demonstrating stream reduction.

### How to Run

1. Compile the class:

   ```bash
   javac Concepts/Stream/reduce.java
   ```

2. Run the program:

   ```bash
   java Concepts.Stream.reduce
   ```

### Sample Output

```
Sum is: 15
New sum is: 15
Max is: 5
```

---

## Requirements

* Java JDK 8 or above
* Familiarity with lambda expressions and functional interfaces
* Basic understanding of streams and collection APIs

## Notes

* Streams provide a powerful, declarative approach to process collections.
* `filter` is useful for conditional selection.
* `reduce` allows combining stream elements into one result.
