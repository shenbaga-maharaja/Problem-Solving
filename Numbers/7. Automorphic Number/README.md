### Problem Statement: Automorphic Number Checker

#### Description:
An automorphic number is a number whose square ends with the same digits as the number itself. For example, 5 is an automorphic number because \(5^2 = 25\) and 6 is an automorphic number because \(6^2 = 36\), whereas 7 is not an automorphic number because \(7^2 = 49\).

Write a Java program to determine whether a given integer is an automorphic number or not.

#### Requirements:
- The program should prompt the user to enter an integer.
- It should then determine whether the entered number is an automorphic number or not.
- The program should handle both positive and negative integers, although typically automorphic numbers are positive.

### Example Input and Output

#### Test Case 1: Automorphic Number
**Input:**
```
Enter the number: 5
```
**Output:**
```
5 is an Automorphic Number
```

#### Test Case 2: Not an Automorphic Number
**Input:**
```
Enter the number: 7
```
**Output:**
```
7 is Not an Automorphic Number
```

#### Test Case 3: Larger Automorphic Number
**Input:**
```
Enter the number: 376
```
**Output:**
```
376 is an Automorphic Number
```

#### Test Case 4: Zero
**Input:**
```
Enter the number: 0
```
**Output:**
```
0 is an Automorphic Number
```

### Explanation of the Code

The provided Java program reads an integer from the user and checks whether it is an automorphic number.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a number (`n`).

2. **Automorphic Check:**
   - The method `isAutomorphic` determines if the number is automorphic:
     - It calculates the square of `n`.
     - It then checks if the last digits of `n` match the last digits of the square by repeatedly comparing the last digit and then removing it (using modulo and integer division).
     - If all corresponding digits match, it returns `true`; otherwise, it returns `false`.

### README.md for Git Repository

#### Automorphic Number Checker

This Java program checks whether a given integer is an automorphic number or not.

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
5. The program will determine if the entered number is an automorphic number or not and display the result.

### Example:
```
Enter the number: 5
5 is an Automorphic Number
```

### Files Included:
- `Main.java`: Contains the Java code for the automorphic number checker program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n /= 10;
            square /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if (isAutomorphic(n)) {
            System.out.println(n + " is an Automorphic Number");
        } else {
            System.out.println(n + " is Not an Automorphic Number");
        }
    }
}
```