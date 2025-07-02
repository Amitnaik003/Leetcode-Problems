Sure! Here's a clean and complete `README.md` file for **LeetCode 240 – Search a 2D Matrix II** using Java with **user input support**.

---

### 📁 `README.md`

```markdown
# 🔍 Search a 2D Matrix II – LeetCode 240

This repository contains a Java solution for the LeetCode problem **Search a 2D Matrix II**, which takes a user-defined matrix and target value, then performs an efficient search.

---

## 🧩 Problem Statement

Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix. This matrix has the following properties:

- Integers in each row are sorted in ascending order from left to right.
- Integers in each column are sorted in ascending order from top to bottom.

---

## 🧪 Example

### Input:
```

matrix = \[
\[1, 4, 7, 11, 15],
\[2, 5, 8, 12, 19],
\[3, 6, 9, 16, 22],
\[10,13,14,17,24],
\[18,21,23,26,30]
]
target = 5

```

### Output:
```

true

````

---

## 💡 Approach

Start from the **top-right** corner and use the following logic:

- If the current number is equal to the target → ✅ return `true`
- If the current number is greater than the target → move **left**
- If the current number is less than the target → move **down**

This ensures a time-efficient solution of **O(m + n)**.

---

## 🧠 Time & Space Complexity

| Metric           | Value     |
|------------------|-----------|
| Time Complexity  | O(m + n)  |
| Space Complexity | O(1)      |

---

## 🛠 How to Run

### 📌 Prerequisites:
- Java JDK installed
- Java added to system `PATH`

### 👨‍💻 Run Steps:

1. Save the file as `SearchMatrix2D.java`
2. Open terminal and run:

```bash
javac SearchMatrix2D.java
java SearchMatrix2D
````

3. Enter:

   * Matrix dimensions
   * Matrix values (row-wise, space-separated)
   * Target value

---

## 🧾 Sample Input (Console)

```
Enter number of rows (m): 3
Enter number of columns (n): 4
Enter the elements of the matrix row by row (sorted):
1 4 7 11
2 5 8 12
3 6 9 16
Enter target to search: 8
```

### Output:

```
Target 8 found? true
```

---

## 🔗 LeetCode Link

[LeetCode 240 – Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/)

---

## 🙋‍♂️ Author

* **Amit Naik**
* Java | DSA | LeetCode Practice

```

---

Let me know if you want:
- Version for file input
- C++/Python version
- GitHub badge formatting
```
