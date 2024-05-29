### Problem Statement: Factorial

#### Description:
The factorial of a non-negative integer `n` is the product of all positive integers less than or equal to `n`. It is denoted by `n!`. For example, the factorial of 5 is 5! = 5 × 4 × 3 × 2 × 1 = 120.

Write a Java program to calculate the factorial of a given non-negative integer.

#### Requirements:
- The program should prompt the user to enter a non-negative integer.
- It should then calculate and display the factorial of the entered number.
- The program should handle edge cases, such as when the input is 0 (0! = 1).

### Example Input and Output

#### Test Case 1: Factorial of 5
**Input:**
```
Enter the number: 5
```
**Output:**
```
The factorial of 5 is 120
```

#### Test Case 2: Factorial of 0
**Input:**
```
Enter the number: 0
```
**Output:**
```
The factorial of 0 is 1
```

#### Test Case 3: Factorial of 1
**Input:**
```
Enter the number: 1
```
**Output:**
```
The factorial of 1 is 1
```

#### Test Case 4: Factorial of 10
**Input:**
```
Enter the number: 10
```
**Output:**
```
The factorial of 10 is 3628800
```

### Explanation of the Code

The provided Java program reads a non-negative integer from the user and calculates its factorial using a simple loop.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a non-negative integer (`n`).

2. **Factorial Calculation:**
   - The program calculates the factorial using a for loop.
   - It multiplies numbers from 1 to `n` to compute the factorial.
   - If the input is 0, the program correctly handles it by returning 1, as 0! = 1.

### README.md for Git Repository

#### Factorial Calculator

This Java program calculates the factorial of a given non-negative integer.

### How to Use:
1. Clone this repository to your local machine.
2. Compile the Java file using a Java compiler.
   ```
   javac Main.java
   ```
3. Run the compiled Java program.
   ```
   java Main
   ```
4. Enter a non-negative integer when prompted.
5. The program will calculate and display the factorial of the entered number.

### Example:
```
Enter the number: 5
The factorial of 5 is 120
```

### Files Included:
- `Main.java`: Contains the Java code for the factorial calculator program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long result = factorial(n);
            System.out.println("The factorial of " + n + " is " + result);
        }
    }
}
```

This code ensures that the program behaves correctly for various values of `n`, including edge cases for 0 and positive integers, and provides a user-friendly message for negative inputs.