
### 📁 `README.md`

```markdown
# 📸 Rotate Image - LeetCode 48

This project provides a Java implementation to rotate an **n x n matrix** by **90 degrees clockwise**, in-place (without using extra space).

---

## 🧩 Problem Statement

You are given an `n x n` 2D matrix representing an image. Rotate the image by 90 degrees clockwise **in-place**.

### 🧪 Examples

#### Example 1:
```

Input:
\[\[1,2,3],
\[4,5,6],
\[7,8,9]]

Output:
\[\[7,4,1],
\[8,5,2],
\[9,6,3]]

```

#### Example 2:
```

Input:
\[\[5,1,9,11],
\[2,4,8,10],
\[13,3,6,7],
\[15,14,12,16]]

Output:
\[\[15,13,2,5],
\[14,3,4,1],
\[12,6,8,9],
\[16,7,10,11]]

````

---

## 💡 Approach: Transpose + Reverse

We rotate the matrix in-place using two steps:

1. **Transpose** the matrix (convert rows to columns).
2. **Reverse** each row.

This avoids using any additional 2D matrix.

---

## 🔁 Algorithm Steps

1. Swap `matrix[i][j]` with `matrix[j][i]` for all `i < j` → Transpose.
2. For each row, use two pointers to reverse it → Reverse.

---

## 🧠 Time & Space Complexity

| Metric            | Value      |
|-------------------|------------|
| Time Complexity   | O(n²)      |
| Space Complexity  | O(1)       |
| In-place          | ✅ Yes     |

---

## 🛠 How to Run

1. Save the code in a file named `RotateImage.java`.
2. Make sure Java is installed.
3. Run the following commands:

```bash
javac RotateImage.java
java RotateImage
````

---

## 📌 Files

* `RotateImage.java` - Contains both the solution and sample test cases.

---

## 🔗 LeetCode Problem Link

[LeetCode 48 - Rotate Image](https://leetcode.com/problems/rotate-image/)

---

## 🙋‍♂️ Author

* **Amit Naik**
* 📘 Java | DSA Practice

