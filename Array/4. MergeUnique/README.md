### Problem Statement

## Merge and Remove Duplicates from Two Sorted Arrays

Write a program that takes two sorted arrays as input and merges them into a single sorted array, removing any duplicate elements in the process. The input arrays are guaranteed to be sorted in non-decreasing order. The output should also be a sorted array with all unique elements.

### Input Format

1. The first line contains an integer `n1` representing the number of elements in the first array.
2. The second line contains `n1` integers separated by spaces representing the elements of the first array.
3. The third line contains an integer `n2` representing the number of elements in the second array.
4. The fourth line contains `n2` integers separated by spaces representing the elements of the second array.

### Output Format

The output should be a single line containing the elements of the merged array without any duplicates, in sorted order.

### Example

**Input:**
```
5
1 2 2 3 5
5
2 3 4 5 6
```

**Output:**
```
[1, 2, 3, 4, 5, 6]
```

### Constraints

- `1 <= n1, n2 <= 1000`
- `-10^9 <= arr1[i], arr2[i] <= 10^9`
- The arrays `arr1` and `arr2` are sorted in non-decreasing order.

## Test Cases

### Test Case 1

**Input:**
```
5
1 2 2 3 5
5
2 3 4 5 6
```

**Expected Output:**
```
[1, 2, 3, 4, 5, 6]
```

### Test Case 2

**Input:**
```
3
1 3 5
4
2 4 6 8
```

**Expected Output:**
```
[1, 2, 3, 4, 5, 6, 8]
```

### Test Case 3

**Input:**
```
4
1 2 3 4
4
5 6 7 8
```

**Expected Output:**
```
[1, 2, 3, 4, 5, 6, 7, 8]
```

### Test Case 4

**Input:**
```
6
1 1 2 2 3 3
6
3 3 4 4 5 5
```

**Expected Output:**
```
[1, 2, 3, 4, 5]
```

### Test Case 5

**Input:**
```
5
-10 -5 0 5 10
5
-7 -3 0 3 7
```

**Expected Output:**
```
[-10, -7, -5, -3, 0, 3, 5, 7, 10]
```

### Usage

To run the program, compile and execute the Java file, and follow the prompts to enter the number of elements and the elements of the arrays. The program will output the merged array without duplicates.

```bash
javac Main.java
java Main
```

### Explanation

The program merges two sorted arrays and removes duplicates using a two-pointer technique to ensure the output array remains sorted. By iterating through both arrays and comparing elements, the program efficiently builds a new array containing all unique elements from both input arrays.