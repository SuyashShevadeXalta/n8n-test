# DSA - Searching Algorithms in Java

A comprehensive collection of searching algorithms implemented in Java with detailed explanations and examples.

## 📚 Algorithms Included

### 1. **Linear Search**
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Use Case:** Small arrays, unsorted data
- **Description:** Simple sequential search through all elements

### 2. **Binary Search**
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1) iterative, O(log n) recursive
- **Use Case:** Large sorted arrays
- **Description:** Divide and conquer approach that eliminates half of remaining elements
- **Variants:**
  - Iterative Binary Search
  - Recursive Binary Search
  - Find First Occurrence
  - Find Last Occurrence

### 3. **Jump Search**
- **Time Complexity:** O(√n)
- **Space Complexity:** O(1)
- **Use Case:** Sorted arrays, when binary search is not preferred
- **Description:** Jumps through blocks and performs linear search within block

### 4. **Exponential Search**
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Use Case:** Unbounded arrays, sorted data
- **Description:** Finds range geometrically then applies binary search

### 5. **Interpolation Search**
- **Time Complexity:** O(log log n) average, O(n) worst case
- **Space Complexity:** O(1)
- **Use Case:** Uniformly distributed sorted arrays
- **Description:** Uses formula to estimate probe position based on value distribution

### 6. **Ternary Search**
- **Time Complexity:** O(log₃ n)
- **Space Complexity:** O(1) iterative, O(log n) recursive
- **Use Case:** Sorted arrays (similar to binary search)
- **Description:** Divides array into three parts instead of two
- **Variants:**
  - Iterative Ternary Search
  - Recursive Ternary Search

### 7. **Fibonacci Search**
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Use Case:** Sorted arrays, when division must avoid multiplication/division
- **Description:** Uses Fibonacci numbers to divide array into unequal parts

## 📊 Complexity Comparison

| Algorithm | Time (Avg) | Time (Worst) | Space | Sorted? |
|-----------|-----------|------------|-------|---------|
| Linear | O(n) | O(n) | O(1) | No |
| Binary | O(log n) | O(log n) | O(1) | Yes |
| Jump | O(√n) | O(√n) | O(1) | Yes |
| Exponential | O(log n) | O(log n) | O(1) | Yes |
| Interpolation | O(log log n) | O(n) | O(1) | Yes |
| Ternary | O(log n) | O(log n) | O(1) | Yes |
| Fibonacci | O(log n) | O(log n) | O(1) | Yes |

## 🏗️ Project Structure

```
src/
└── searching/
    ├── LinearSearch.java
    ├── BinarySearch.java
    ├── JumpSearch.java
    ├── ExponentialSearch.java
    ├── InterpolationSearch.java
    ├── TernarySearch.java
    └── FibonacciSearch.java
```

## 🚀 How to Use

### Compilation
```bash
javac src/searching/*.java
```

### Running Individual Algorithms
```bash
java -cp src searching.LinearSearch
java -cp src searching.BinarySearch
java -cp src searching.JumpSearch
java -cp src searching.ExponentialSearch
java -cp src searching.InterpolationSearch
java -cp src searching.TernarySearch
java -cp src searching.FibonacciSearch
```

## 💡 Usage Examples

### Linear Search
```java
int[] arr = {10, 20, 30, 40, 50};
int index = LinearSearch.linearSearch(arr, 40);
// Returns: 3
```

### Binary Search
```java
int[] arr = {10, 20, 30, 40, 50};
int index = BinarySearch.binarySearchIterative(arr, 40);
// Returns: 3
```

### Find Duplicates
```java
int[] arr = {10, 20, 20, 20, 30, 40};
int first = BinarySearch.findFirstOccurrence(arr, 20);  // 1
int last = BinarySearch.findLastOccurrence(arr, 20);    // 3
```

### Jump Search
```java
int[] arr = {0, 1, 4, 6, 8, 9, 13, 15, 17};
int index = JumpSearch.jumpSearch(arr, 13);
// Returns: 6
```

## 🎯 When to Use Each Algorithm

| Algorithm | Best Use Cases |
|-----------|-----------------|
| **Linear** | Unsorted data, small arrays, linked lists |
| **Binary** | Large sorted arrays, most common choice |
| **Jump** | Sorted arrays, when memory access is expensive |
| **Exponential** | Unbounded/infinite arrays, large range |
| **Interpolation** | Uniformly distributed sorted data |
| **Ternary** | Similar to binary but some prefer conceptually |
| **Fibonacci** | When avoiding multiplication/division operations |

## 📖 Key Concepts

### Prerequisites
- Arrays and array indexing
- Sorting algorithms (data must be sorted for most algorithms)
- Big-O notation and complexity analysis
- Recursion (for recursive variants)

### Important Notes
- **Most algorithms require sorted input** (except Linear Search)
- Always verify if array is sorted before using binary search variants
- For small arrays (n < 100), linear search may be faster due to low overhead
- Consider cache locality and practical performance, not just Big-O

## 🔍 Algorithm Selection Guide

```
Start
  ↓
Is array sorted?
  ├─ NO → Use Linear Search
  ├─ YES → Array size?
      ├─ Small (< 100) → Linear or Binary Search
      ├─ Medium (100-10000) → Binary Search
      ├─ Large (> 10000) → Binary Search or specialized
          ├─ Uniformly distributed? → Interpolation Search
          ├─ Need to avoid mult/div? → Fibonacci Search
          └─ Default → Binary Search
```

## ⚙️ Requirements
- Java 8 or higher
- No external dependencies

## 📝 License
This project is open source and available under the MIT License.

## 👨‍💻 Author
Created as a comprehensive DSA learning resource for searching algorithms.

## 🤝 Contributing
Feel free to contribute improvements, bug fixes, or additional algorithms!

---

**Happy Searching! 🔎**