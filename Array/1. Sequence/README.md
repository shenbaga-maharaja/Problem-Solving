---

## Problem Statement:

Write a Java program `Sequence` that takes a sequence of integers as input and outputs a modified sequence based on a user input.

### Program Specifications:
- The program first displays the given sequence of integers.
- Then, it prompts the user to input an integer.
- Upon receiving the input, the program finds the index of the input in the sequence.
- It then outputs the sequence starting from the found index to the end, followed by the sequence from the beginning up to the found index.

### Example:
Given the sequence: `1 2 3 4 5`

If the user input is `3`, the program should output `3 4 5 1 2`.

---

## Test Cases:

### Test Case 1:
**Input:**
```
Enter the input: 2
```
**Output:**
```
The sequence is:
1 2 3 4 5 
2 3 4 5 1 
```

### Test Case 2:
**Input:**
```
Enter the input: 5
```
**Output:**
```
The sequence is:
1 2 3 4 5 
5 1 2 3 4 
```

### Test Case 3:
**Input:**
```
Enter the input: 1
```
**Output:**
```
The sequence is:
1 2 3 4 5 
1 2 3 4 5 
```

---

Feel free to modify the problem statement and test cases according to your specific requirements or constraints.