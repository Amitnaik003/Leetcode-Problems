
```markdown
# LeetCode 330. Patching Array

## 📌 Problem Statement
You are given a sorted integer array `nums` and an integer `n`.  
Your task is to **add the minimum number of patches** (extra numbers) to the array such that **every number in the range `[1, n]`** can be formed as the sum of some subset of elements in the array.

Return the minimum number of patches required.

---

## 🔹 Example 1
**Input:**  
```

nums = [1, 3], n = 6

```

**Output:**  
```

1

```

**Explanation:**  
- With `[1, 3]`, we can form sums {1, 3, 4}. Missing numbers are {2, 5, 6}.  
- Adding `2` fills the gap: `[1, 2, 3]` → possible sums {1, 2, 3, 4, 5, 6}.  
- ✅ Only 1 patch needed.

---

## 🔹 Example 2
**Input:**  
```

nums = [1, 5, 10], n = 20

```

**Output:**  
```

2

```

**Explanation:**  
- With `[1, 5, 10]`, we can make sums {1, 5, 6, 10, 11, 15, 16}, leaving gaps like 2–4, 7–9, etc.  
- If we patch with `2` and `4`, the array becomes `[1, 2, 4, 5, 10]`.  
- Now we can form **every number from 1 to 20**.  
- ✅ Minimum patches = 2.

---

## 🔹 Example 3
**Input:**  
```

nums = [1, 2, 2], n = 5

```

**Output:**  
```

0

````

**Explanation:**  
- With `[1, 2, 2]`, we can form {1, 2, 3, 4, 5}.  
- ✅ No patch needed.

---

## 🚀 Approach (Greedy)
- Keep track of the **smallest number `miss`** that we cannot form yet.
- If the current number `nums[i]` is ≤ `miss`, use it to extend coverage (`miss += nums[i]`).  
- If `nums[i]` is > `miss`, patch the array with `miss` itself. This doubles the coverage (`miss += miss`), and we count one patch.  
- Repeat until `miss > n`.  

This greedy method ensures **minimum patches**, since patching with `miss` always fills the smallest gap and maximizes coverage.

---

## ⏱️ Complexity
- **Time Complexity:** `O(len(nums))` (each element is processed once)  
- **Space Complexity:** `O(1)` (constant extra space)  

---

## 💻 Java Solution
```java
class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;   // smallest number we can't form yet
        int patches = 0;
        int i = 0;

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i];
                i++;
            } else {
                miss += miss; // patch with 'miss'
                patches++;
            }
        }
        return patches;
    }
}
````

---

## ✅ Key Insight

* Without patching, `[1,5,10]` could only form numbers up to 16 but with gaps.
* By patching strategically with 2 and 4, we can form **all numbers up to 20**.
* Greedy ensures we always patch at the best spot.

---