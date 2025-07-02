### 📁 `README.md`

```markdown
# 🔍 Search a 2D Matrix – LeetCode 74

This repository contains a Java solution to the LeetCode problem **Search a 2D Matrix** using binary search.

---

## 🧩 Problem Statement

You are given an `m x n` integer matrix with the following properties:

1. Each row is sorted in non-decreasing order.
2. The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` if it exists in the matrix, otherwise return `false`.

---

## 🧪 Examples

### Example 1:

**Input:**
```

matrix = \[
\[1, 3, 5, 7],
\[10, 11, 16, 20],
\[23, 30, 34, 60]
]
target = 3

```

**Output:** `true`

---

### Example 2:

**Input:**
```

matrix = \[
\[1, 3, 5, 7],
\[10, 11, 16, 20],
\[23, 30, 34, 60]
]
target = 13

````

**Output:** `false`

---

## 💡 Approach: Binary Search on a Virtual 1D Array

Treat the 2D matrix as a flattened 1D array and apply binary search:

- Convert 1D index `i` to 2D using:
  - Row index = `i / n`
  - Column index = `i % n`

This allows binary search in **O(log(m * n))** time.

---

## 🔁 Algorithm

1. Initialize `left = 0` and `right = m * n - 1`
2. While `left <= right`:
   - Find `mid`
   - Map it to matrix using: `matrix[mid / n][mid % n]`
   - Compare and adjust search range

---

## 🧠 Time & Space Complexity

| Metric            | Value         |
|------------------|---------------|
| Time Complexity   | O(log(m × n)) |
| Space Complexity  | O(1)          |

---

## 🛠 How to Run

1. Make sure Java is installed.
2. Save the file as `Solution.java`
3. Compile and run:

```bash
javac Solution.java
java Solution
````

---

## 📄 Files

* `Solution.java` – Contains both the solution and a testable `main()` method.

---

## 🔗 LeetCode Link

[LeetCode Problem 74 – Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)

---

## 🙋 Author

* **Amit Naik**
* 🚀 DSA Practice | Java | LeetCode

