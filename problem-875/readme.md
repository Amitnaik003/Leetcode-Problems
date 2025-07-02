
### 📄 `README.md`

````markdown
# 🍌 875. Koko Eating Bananas

Koko loves to eat bananas. There are `n` piles of bananas, and the `i`th pile has `piles[i]` bananas. The guards have gone and will return in `h` hours.

Koko eats bananas at a constant speed `k` bananas per hour. Every hour, she chooses one pile and eats up to `k` bananas from that pile. If the pile has fewer than `k` bananas, she eats all of them and waits for the next hour.

Your task is to return the **minimum integer `k`** such that she can eat all the bananas **within `h` hours**.

---

## 🧠 Problem Constraints

- `1 <= piles.length <= 10^4`
- `piles.length <= h <= 10^9`
- `1 <= piles[i] <= 10^9`

---

## 📥 Example Inputs and Outputs

### Example 1
**Input:**
```text
piles = [3,6,7,11], h = 8
````

**Output:**

```text
4
```

### Example 2

**Input:**

```text
piles = [30,11,23,4,20], h = 5
```

**Output:**

```text
30
```

### Example 3

**Input:**

```text
piles = [30,11,23,4,20], h = 6
```

**Output:**

```text
23
```

---

## 🔍 Approach

We use **binary search** to find the minimum `k` (eating speed). The idea is:

* Search between `1` (slowest valid speed) and `max(piles)` (fastest, 1 pile/hour).
* For each `k`, calculate how many hours it would take to eat all piles.
* Use ceiling division for `hours = ceil(pile / k)`.
* If total hours needed ≤ `h`, try smaller `k`; otherwise, increase `k`.

---

## 🧠 Time and Space Complexity

| Type             | Complexity               |
| ---------------- | ------------------------ |
| Time Complexity  | `O(n * log(max(piles)))` |
| Space Complexity | `O(1)`                   |

Where `n` is the number of piles.

---

## 🧪 Java Function

```java
public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = getMax(piles);
    int result = right;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        long hoursNeeded = getTotalHours(piles, mid);

        if (hoursNeeded <= h) {
            result = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return result;
}

private int getMax(int[] piles) {
    int max = 0;
    for (int pile : piles) {
        max = Math.max(max, pile);
    }
    return max;
}

private long getTotalHours(int[] piles, int k) {
    long hours = 0;
    for (int pile : piles) {
        hours += (pile + (long)k - 1) / k; // ceil(pile / k)
    }
    return hours;
}
```

---

## 📌 Notes

* Use `long` instead of `int` in calculations to avoid overflow.
* Edge case: If `h` is large (like `10^9`), `k = 1` might still work — but we need to verify correctly.

---

## ✅ Tags

`Binary Search`, `Greedy`, `Math`, `LeetCode`, `Java`
