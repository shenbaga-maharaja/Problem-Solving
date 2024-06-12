### Problem Statement:

Create a Java program to calculate the mode(s) of a given list of numbers without using built-in functions.

#### Input:

- An array of integers representing the list of numbers.

#### Output:

- An array of integers representing the mode(s) of the input list.

#### Constraints:

- The input array will not be empty.
- The input array can contain both positive and negative integers.
- There may be more than one mode in the input list.
- The output should be sorted in ascending order.

### Example:

#### Input:

```java
int[] numbers = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
```

#### Output:

```java
int[] modes = {3, 4};
```

### Test Cases:

1. **Single Mode**:
   - Input: `{1, 1, 2, 2, 3, 3, 3}`
   - Output: `{3}`

2. **Multiple Modes**:
   - Input: `{1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}`
   - Output: `{3, 4}`

3. **Negative Numbers**:
   - Input: `{-3, -2, -2, -1, -1, 0, 0, 1, 1, 2, 2}`
   - Output: `{-2, -1, 1, 2}`

4. **Mixed Positive and Negative Numbers**:
   - Input: `{-3, -2, -2, -1, -1, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3}`
   - Output: `{3}`

5. **Repeated Modes**:
   - Input: `{1, 1, 2, 2, 3, 3, 4, 4}`
   - Output: `{1, 2, 3, 4}`

These test cases cover various scenarios such as single mode, multiple modes, negative numbers, mixed positive and negative numbers, and repeated modes.