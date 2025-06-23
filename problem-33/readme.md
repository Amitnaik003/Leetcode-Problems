Here is a professional and clean **`README.md`** file for your problem **"33. Search in Rotated Sorted Array"**, based on the LeetCode-style description you provided:

---

## 📘 33. Search in Rotated Sorted Array

**Difficulty:** Medium
**Tags:** Binary Search, Array, Divide and Conquer
**Time Complexity:** `O(log n)`

---

### 🧩 Problem Statement

There is an integer array `nums` sorted in ascending order (with **distinct values**).

Before being passed to your function, `nums` is **possibly rotated** at an unknown pivot index `k` (`1 <= k < nums.length`) such that the resulting array becomes:

```
[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
```

For example, the array `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`.

---

### 🎯 Objective

Given the rotated array `nums` and an integer `target`, return the **index** of `target` if it exists in the array. Otherwise, return `-1`.

The solution must have a **runtime complexity of O(log n)**.

---

### 🧪 Example Inputs and Outputs

#### Example 1

```
Input:  nums = [4,5,6,7,0,1,2], target = 0  
Output: 4
```

#### Example 2

```
Input:  nums = [4,5,6,7,0,1,2], target = 3  
Output: -1
```

#### Example 3

```
Input:  nums = [1], target = 0  
Output: -1
```

---

### 📌 Constraints

* `1 <= nums.length <= 5000`
* `-10⁴ <= nums[i] <= 10⁴`
* All values in `nums` are **unique**
* `nums` is an ascending array that is **possibly rotated**
* `-10⁴ <= target <= 10⁴`

---

### 💡 Approach

We apply **modified binary search** to handle the rotated part of the array:

1. Find `mid = (left + right) / 2`.
2. Determine whether the **left half** or the **right half** is sorted.
3. Narrow down the search space accordingly.

This ensures **logarithmic performance**, maintaining `O(log n)` time complexity even with rotation.

---

### 🧑‍💻 Sample Java Code (with User Input)

```java
import java.util.Scanner;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int result = sol.search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
```

---

### ✅ Output Example

```
Enter number of elements: 7  
Enter the elements of the rotated sorted array:  
4 5 6 7 0 1 2  
Enter target to search: 0  
Target found at index: 4
```

---

### 📎 Related Topics

* Binary Search
* Rotated Arrays
* Divide and Conquer

---

Let me know if you want to generate a `README.md` for a GitHub repo with markdown badges, license, or build status.
