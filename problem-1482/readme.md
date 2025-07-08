
### 📄 `README.md`

```markdown
# 🌸 Minimum Number of Days to Make m Bouquets

This Java program solves the LeetCode problem **1482. Minimum Number of Days to Make m Bouquets**.

You are given:
- An integer array `bloomDay[]` representing the day each flower blooms.
- Two integers: `m` (number of bouquets needed) and `k` (number of **adjacent** flowers required per bouquet).

Your goal is to find the **minimum number of days** required to make exactly `m` bouquets. If it's impossible, return `-1`.

---

## 💡 Problem Statement

To make `m` bouquets, each requiring `k` **adjacent** bloomed flowers, find the minimum number of days such that this is possible using the given `bloomDay[]`.

### Constraints:
- Each flower can be used in **only one** bouquet.
- A flower blooms on `bloomDay[i]`, and only after that it can be used.

---

## 🧪 Sample Input/Output

### Example 1:
```

Input:
bloomDay = \[1, 10, 3, 10, 2]
m = 3
k = 1

Output:
3

```

### Example 2:
```

Input:
bloomDay = \[1, 10, 3, 10, 2]
m = 3
k = 2

Output:
-1

```

### Example 3:
```

Input:
bloomDay = \[7, 7, 7, 7, 12, 7, 7]
m = 2
k = 3

Output:
12

````

---

## 🛠️ How It Works

This solution uses **binary search** on the range of days (1 to max bloomDay) to find the minimum day that allows forming `m` bouquets with `k` adjacent flowers.

The `canMake()` helper checks if it's possible to make required bouquets on a given day by scanning through `bloomDay`.

---

## 🚀 How to Run

### ✅ Prerequisites

- Java JDK 8 or higher
- Any IDE or terminal to run Java code

### 📥 Input Format

1. Number of flowers
2. Bloom day of each flower (array)
3. `m` - number of bouquets
4. `k` - number of adjacent flowers per bouquet

### ▶️ Run the Program

```bash
javac MinimumDaysToMakeBouquets.java
java MinimumDaysToMakeBouquets
````

### 👇 Example Run

```
Enter number of flowers: 5
Enter bloom days:
1 10 3 10 2
Enter number of bouquets (m): 3
Enter number of adjacent flowers per bouquet (k): 1

Output:
Minimum number of days to make 3 bouquets: 3
```

---

## 📈 Time & Space Complexity

* Time: `O(n * log(max(bloomDay)))`
* Space: `O(1)`

---

## 🧠 Concepts Used

* Binary Search
* Greedy Grouping
* Adjacency Handling

---

## 📚 References

* [Leetcode Problem #1482](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)

---

## ✍️ Author

**Amit Naik**
