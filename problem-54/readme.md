
```markdown
# Spiral Matrix (LeetCode 54)

## Problem Statement
Given an `m x n` matrix, return all elements of the matrix in spiral order.

### Example 1:
**Input:**
```

matrix = [[1,2,3],
[4,5,6],
[7,8,9]]

```

**Output:**
```

[1,2,3,6,9,8,7,4,5]

```

### Example 2:
**Input:**
```

matrix = [[1,2,3,4],
[5,6,7,8],
[9,10,11,12]]

```

**Output:**
```

[1,2,3,4,8,12,11,10,9,5,6,7]

````

---

## Approach
We simulate the spiral traversal by maintaining **four boundaries**:
- `startRow` (top row index)
- `endRow` (bottom row index)
- `startCol` (left column index)
- `endCol` (right column index)

At each step:
1. Traverse the **top row** (left → right).
2. Traverse the **right column** (top → bottom).
3. Traverse the **bottom row** (right → left) if not already traversed.
4. Traverse the **left column** (bottom → top) if not already traversed.

After each cycle, shrink the boundaries (`startRow++`, `endRow--`, `startCol++`, `endCol--`) and repeat until all elements are covered.

---

## Complexity Analysis
- **Time Complexity:** `O(m * n)` → Each element is visited exactly once.
- **Space Complexity:** `O(1)` → Apart from the output list, no extra space is used.

---

## Java Solution
```java
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int startRow = 0, startCol = 0;
        int endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            // bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
            }
            // left
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
            }
            
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        
        return result;
    }
}
````

---

## Related Problems

* [LeetCode 59: Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)
* [LeetCode 885: Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/)


