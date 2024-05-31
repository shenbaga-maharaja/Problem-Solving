### Problem Statement: GCD (Greatest Common Divisor) Finder

#### Description:
Write a Java program to find the Greatest Common Divisor (GCD) of two given integers. The GCD of two integers is the largest positive integer that divides both numbers without leaving a remainder.

#### Requirements:
- The program should prompt the user to enter two integers.
- It should then calculate and display the GCD of the entered integers.
- The program should handle both positive and negative integers, but typically GCD is considered for non-zero numbers.

### Example Input and Output

#### Test Case 1: Positive Integers
**Input:**
```
Enter the number1: 48
Enter the number2: 18
```
**Output:**
```
GCD of 48 and 18 is 6
```

#### Test Case 2: One Negative Integer
**Input:**
```
Enter the number1: -48
Enter the number2: 18
```
**Output:**
```
GCD of -48 and 18 is 6
```

#### Test Case 3: Both Negative Integers
**Input:**
```
Enter the number1: -48
Enter the number2: -18
```
**Output:**
```
GCD of -48 and -18 is 6
```

#### Test Case 4: One Zero
**Input:**
```
Enter the number1: 0
Enter the number2: 18
```
**Output:**
```
GCD of 0 and 18 is 18
```

#### Test Case 5: Both Zeros
**Input:**
```
Enter the number1: 0
Enter the number2: 0
```
**Output:**
```
GCD of 0 and 0 is undefined (handled in your implementation as returning 0)
```

### Explanation

The program reads two integers from the user and calculates their GCD using the Euclidean algorithm. The Euclidean algorithm works by repeatedly replacing the larger number by its remainder when divided by the smaller number until one of the numbers becomes zero. The non-zero number at this point is the GCD.

1. **Input Handling:**
   - The program uses `Scanner` to read two integers from the user.
   - It prompts the user to enter the first number (`a`) and the second number (`b`).

2. **GCD Calculation:**
   - The method `findGCD` uses recursion to calculate the GCD:
     - If `b` is 0, it returns `a` as the GCD.
     - Otherwise, it recursively calls `findGCD` with `b` and `a % b` as arguments.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int a = s.nextInt();
        System.out.print("Enter the number2: ");
        int b = s.nextInt();
        System.out.print("GCD of " + a + " and " + b + " is " + findGCD(a, b));
    }
}
```