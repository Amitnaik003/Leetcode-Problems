This Java program is a **solution to the popular “Two Sum” problem**, where you're given an array of integers and a target value, and you need to find two numbers in the array that add up to the target. The program returns the indices of those two numbers.

---

## 🔍 **Code Breakdown and Explanation**

---

### ✅ `import java.util.Scanner;`

* Imports the `Scanner` class to allow user input from the console.

---

### ✅ `public class Solution`

* Defines a class named `Solution`. All methods and the `main()` function are written inside this class.

---

### ✅ `public int[] twoSum(int[] nums, int target)`

This is a method to find two numbers in the array that add up to the given target.

#### 🔁 Loops Explanation:

```java
for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
            return new int[] { i, j };
        }
    }
}
```

* It uses **nested loops** to check every possible pair of elements in the array.
* If a pair is found such that `nums[i] + nums[j] == target`, the indices `[i, j]` are returned.
* `i < j` ensures the same element is not used twice.

#### ❌ Return if no solution:

```java
return new int[0];
```

* If no such pair exists, it returns an **empty array**, although this shouldn't happen as the problem assumes a valid solution always exists.

---

### ✅ `public static void main(String[] args)`

The main method where execution starts.

#### 🔸 Step-by-step flow:

1. **User Input for Array Size:**

```java
System.out.print("Enter the size of the array: ");
int n = scanner.nextInt();
```

2. **Array Declaration:**

```java
int[] nums = new int[n];
```

3. **Input Array Elements:**

```java
for (int i = 0; i < n; i++) {
    nums[i] = scanner.nextInt();
}
```

4. **Target Value Input:**

```java
System.out.print("Enter the target value: ");
int target = scanner.nextInt();
```

5. **Call the `twoSum()` Method:**

```java
Solution solution = new Solution();
int[] result = solution.twoSum(nums, target);
```

6. **Output the Indices:**

```java
if (result.length == 2) {
    System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
} else {
    System.out.println("No solution found!");
}
```

7. **Close Scanner to Avoid Warnings:**

```java
scanner.close();
```

---

## 🔚 Example Run

### Input:

```
Enter the size of the array: 5
Enter the elements of the array:
2 7 11 15 1
Enter the target value: 9
```

### Output:

```
Indices: [0, 1]
```

✅ Because `2 + 7 = 9`, and they are at indices 0 and 1.

---

## 🧠 Summary

| Part    | Description                                   |
| ------- | --------------------------------------------- |
| Purpose | Find indices of two numbers summing to target |
| Input   | Array elements and a target value             |
| Logic   | Nested loop to check all pairs                |
| Output  | Indices of the two elements or error msg      |

