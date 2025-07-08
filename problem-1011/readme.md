
### 📄 `README.md`

```markdown
# 📦 Ship Packages Within D Days - Java Solution

This Java program solves the **"Capacity To Ship Packages Within D Days"** problem using **binary search**. It allows the user to input the weights of the packages and the number of days, and outputs the minimum ship capacity required to ship all packages within the given days.

---

## 🚀 Problem Statement

You are given an array `weights[]` where `weights[i]` is the weight of the `i-th` package on a conveyor belt. All packages must be shipped in the given order. You are also given an integer `days`, representing the number of days within which all packages must be shipped.

Your task is to determine the **minimum ship capacity** needed to complete the shipment in exactly `days` days.

---

## ✅ Example

### Input:
```

Enter number of packages: 10
Enter the weights of packages:
1 2 3 4 5 6 7 8 9 10
Enter number of days: 5

```

### Output:
```

Minimum ship capacity required: 15

````

---

## 📦 How It Works

The program uses **binary search** between:
- The **maximum** single package weight (lower bound).
- The **sum** of all weights (upper bound).

For each midpoint capacity, it checks whether it's feasible to ship all packages in the given days using a greedy approach.

---

## 🛠️ How to Run

1. **Compile** the Java file:
```bash
javac Solution.java
````

2. **Run** the program:

```bash
java Solution
```

3. **Follow the prompts** to enter the number of packages, their weights, and the number of days.

---

## 📁 Files

* `Solution.java` – Main Java class with user input and binary search logic.
* `README.md` – This documentation file.

---

## 📚 Concepts Used

* Binary Search on Answer Space
* Greedy Simulation
* Java Scanner for User Input

---

## 🔗 Related LeetCode Problem

* [LeetCode 1011 - Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)

---

## 🧑‍💻 Author

This project was implemented as part of Java problem-solving practice.

