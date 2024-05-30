### Problem Statement: Factor Finder

#### Description:
Write a Java program to find and print all the factors of a given integer. A factor of a number is an integer that divides the number without leaving a remainder.

#### Requirements:
- The program should prompt the user to enter an integer.
- It should then determine and print all the factors of the entered number.
- The program should handle both positive and negative integers, but typically factors are considered for positive numbers.

### Example Input and Output

#### Test Case 1: Positive Integer
**Input:**
```
Enter the number: 12
```
**Output:**
```
Factors of 12 are: 1 2 3 4 6 12 
```

#### Test Case 2: Prime Number
**Input:**
```
Enter the number: 7
```
**Output:**
```
Factors of 7 are: 1 7 
```

#### Test Case 3: Negative Integer
**Input:**
```
Enter the number: -6
```
**Output:**
```
Factors of -6 are: 1 2 3 6 
```

#### Test Case 4: Zero
**Input:**
```
Enter the number: 0
```
**Output:**
```
Factors of 0 are: All integers (undefined in the typical mathematical sense)
```

### Explanation of the Code

The provided Java program reads an integer from the user and prints all its factors.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a number (`n`).

2. **Finding Factors:**
   - The method `findFactors` determines all the factors of the number:
     - It iterates from 1 to `n` (inclusive).
     - For each number `i` in this range, it checks if `i` is a factor of `n` by verifying if `n % i == 0`.
     - If `i` is a factor, it prints `i`.

### README.md for Git Repository

#### Factor Finder

This Java program finds and prints all the factors of a given integer.

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
4. Enter an integer when prompted.
5. The program will print all the factors of the entered number.

### Example:
```
Enter the number: 12
Factors of 12 are: 1 2 3 4 6 12 
```

### Files Included:
- `Main.java`: Contains the Java code for the factor finder program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static void findFactors(int n) {
        if (n == 0) {
            System.out.println("Factors of 0 are: All integers (undefined in the typical mathematical sense)");
            return;
        }

        n = Math.abs(n); // To handle negative numbers, we work with their absolute value
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Factors of " + n + " are: ");
        findFactors(n);
        System.out.println(); // New line for better output formatting
    }
}
```