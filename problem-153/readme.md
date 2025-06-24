**binary search (O(log n))** with **user input support** in Java:

---

```markdown
# 🔍 Find Minimum in Rotated Sorted Array

This Java program finds the **minimum element** in a rotated sorted array using **binary search** with a time complexity of `O(log n)`.

A **rotated sorted array** is an array that was originally sorted in ascending order, then rotated between 1 and `n` times. This problem is commonly seen in competitive programming and technical interviews.

---

## 📌 Problem Statement

You are given a sorted array of unique integers that has been rotated. Your task is to return the **minimum element** in this array.

### 🔁 Rotation Explained:
Rotating an array `[a[0], a[1], ..., a[n-1]]` one time results in `[a[n-1], a[0], ..., a[n-2]]`.

### ✅ Constraints:
- All integers are **unique**
- Array is **non-empty**
- The array was **originally sorted in ascending order**

---

## 🧪 Sample Input/Output

### Example 1:
```
Input:
Size of array: 5
Elements: 3 4 5 1 2

Output:
The minimum element in the sorted array is: 1
```

### Example 2:
```
Input:
Size of array: 7
Elements: 11 13 15 17 1 2 5

Output:
The minimum element in the sorted array is: 1
```

---

## ⚙️ How It Works

The algorithm uses **binary search**:

1. Initialize two pointers, `left` and `right`.
2. While `left < right`, calculate the middle index:
   ```java
   mid = left + (right - left) / 2;
   ```
3. If the middle element is greater than the right element, the minimum lies in the **right half**.
4. Otherwise, the minimum is in the **left half** (including mid).
5. When `left == right`, that index holds the minimum value.

---

## 🧑‍💻 Code Overview

```java
import java.util.Scanner;

public class MinimumSortedArray {
    public static int findmin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minElement = findmin(nums);
        System.out.println("The minimum element in the sorted array is: " + minElement);
    }
}
```

---

## 🧠 Time & Space Complexity

| Metric             | Value        |
|--------------------|--------------|
| Time Complexity    | `O(log n)`   |
| Space Complexity   | `O(1)`       |

---

## 📂 How to Run

1. Save the code to a file named `MinimumSortedArray.java`
2. Compile:  
   ```bash
   javac MinimumSortedArray.java
   ```
3. Run:  
   ```bash
   java MinimumSortedArray
   ```

---

## 🏷️ Tags

- Binary Search
- Rotated Array
- Algorithms
- Java
- Interview Questions

---
