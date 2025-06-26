Sure! Here's a simple and clear `README.md` file for your **Rotate Array (LeetCode 189)** Java solution:

---

### 📁 `README.md`

```markdown
# 🔁 Rotate Array - LeetCode 189

This project provides a Java implementation to solve the **"Rotate Array"** problem from LeetCode.

## 🚀 Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example 1:
```

Input: nums = \[1,2,3,4,5,6,7], k = 3
Output: \[5,6,7,1,2,3,4]

```

### Example 2:
```

Input: nums = \[-1,-100,3,99], k = 2
Output: \[3,99,-1,-100]

```

---

## 💡 Approach

This solution uses the **array reversal technique**, which is an efficient way to rotate an array in-place using `O(1)` extra space.

### Steps:
1. Reverse the whole array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n-k` elements.

### Time & Space Complexity:
- **Time:** O(n)
- **Space:** O(1)

---

## 🧾 Code Structure

- **Main.java**
  - Contains the `main()` method for testing.
  - Creates arrays and calls the `rotate()` function.

- **Solution class**
  - `rotate(int[] nums, int k)` performs the rotation.
  - `reverse(int[] nums, int start, int end)` is a helper method.

---

## ✅ Sample Output

```

Output 1: \[5, 6, 7, 1, 2, 3, 4]
Output 2: \[3, 99, -1, -100]

````

---

## 🛠 How to Run

1. Make sure you have Java installed.
2. Save the code in a file named `Main.java`.
3. Compile and run using:

```bash
javac Main.java
java Main
````

---

## 🔗 LeetCode Link

[LeetCode Problem 189 - Rotate Array](https://leetcode.com/problems/rotate-array/)

---

## 📌 Author

* **Amit Naik**
* 💼 Internship Tasks & DSA Practice

```

Let me know if you want to add GitHub badge, images, or language toggle!
```
