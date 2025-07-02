### 📁 `README.md`

````markdown
# 📐 LeetCode 69 – Sqrt(x)

This project contains a Java solution to the classic algorithm problem **Sqrt(x)** (LeetCode #69), where we compute the integer square root of a non-negative integer using **binary search**.

---

## 🧩 Problem Statement

Given a non-negative integer `x`, return the square root of `x` **rounded down** to the nearest integer.

> **Note:** You must not use any built-in exponent function or operator (e.g., `Math.pow()`, `sqrt()`, or `x ** 0.5`).

---

## 🧪 Example Inputs & Outputs

### ✅ Example 1
**Input:** `x = 4`  
**Output:** `2`  
**Explanation:** √4 = 2

### ✅ Example 2
**Input:** `x = 8`  
**Output:** `2`  
**Explanation:** √8 ≈ 2.828..., which rounds down to 2

---

## 💡 Approach: Binary Search

Since square root of `x` always lies between `1` and `x / 2`, we use binary search to find the greatest `mid` such that `mid * mid ≤ x`.

---

## 🧠 Time & Space Complexity

| Metric           | Value       |
|------------------|-------------|
| Time Complexity   | O(log x)    |
| Space Complexity  | O(1)        |

---

## 👨‍💻 How to Run

### 💻 Prerequisites:
- Java JDK installed
- Java added to your system `PATH`

### 🛠 Compile and Run:
1. Save the code as `SquareRoot.java`
2. Open a terminal and run:

```bash
javac SquareRoot.java
java SquareRoot
````

### 💡 Sample Console Input:

```
Enter a non-negative integer: 16
```

### ✅ Output:

```
Integer square root of 16 is: 4
```

---

## 📄 File Description

| File              | Description                                    |
| ----------------- | ---------------------------------------------- |
| `SquareRoot.java` | Java program with binary search and user input |

---

## 🔗 LeetCode Link

[🔗 LeetCode 69 – Sqrt(x)](https://leetcode.com/problems/sqrtx/)

---

## 🙋 Author

* **Amit Naik**
* Java | DSA | Problem Solving | LeetCode Practice
