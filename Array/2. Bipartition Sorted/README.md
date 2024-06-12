### Problem Statement

Implement a Java program that sorts an array of integers such that all even numbers appear in ascending order followed by all odd numbers in descending order. The program should accomplish this in an efficient manner, using a two-way sorting technique.

### Solution Approach

1. Iterate through the array and make all odd numbers negative.
2. Sort the entire array. This will place the negative (originally odd) numbers at the beginning of the array in ascending order, followed by the positive (originally even) numbers in ascending order.
3. Iterate through the sorted array again and convert all negative numbers back to positive, restoring the original odd numbers.

### Test Cases

Here are some test cases to validate the implementation:

1. **Example Case**
    - Input: `[1, 3, 2, 7, 5, 4]`
    - Output: `[7, 5, 3, 1, 2, 4]`
    - Explanation: Even numbers `[2, 4]` are in ascending order, and odd numbers `[7, 5, 3, 1]` are in descending order.

2. **All Even Numbers**
    - Input: `[8, 2, 4, 6]`
    - Output: `[2, 4, 6, 8]`
    - Explanation: Since there are no odd numbers, the even numbers are sorted in ascending order.

3. **All Odd Numbers**
    - Input: `[7, 3, 9, 1]`
    - Output: `[9, 7, 3, 1]`
    - Explanation: Since there are no even numbers, the odd numbers are sorted in descending order.

4. **Mixed Even and Odd Numbers**
    - Input: `[10, 21, 4, 45, 6, 93, 2]`
    - Output: `[2, 4, 6, 10, 93, 45, 21]`
    - Explanation: Even numbers `[2, 4, 6, 10]` are in ascending order, and odd numbers `[93, 45, 21]` are in descending order.

### Example Usage

```java
import java.util.Arrays;

public class Main {
    // To do two-way sort. First sort even numbers in ascending order,
    // then odd numbers in descending order.
    static void twoWaySort(int arr[], int n) {
        // Make all odd numbers negative
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) != 0) // Check for odd
                arr[i] *= -1;
        }

        // Sort all numbers
        Arrays.sort(arr);

        // Retaining original array
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) != 0)
                arr[i] *= -1;
        }
    }

    // Driver Method
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 7, 5, 4};

        System.out.print("Original Array Elements : ");
        System.out.println(Arrays.toString(arr));

        twoWaySort(arr, arr.length);

        System.out.print("Bipartition Sorted Array Elements : ");
        System.out.println(Arrays.toString(arr));
    }
}
```

### Expected Output

```plaintext
Original Array Elements : [1, 3, 2, 7, 5, 4]
Bipartition Sorted Array Elements : [7, 5, 3, 1, 2, 4]
```