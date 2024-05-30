### Problem Statement: Prime Number Checker

#### Description:
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. Write a Java program to determine whether a given integer is a prime number or not.

#### Requirements:
- The program should prompt the user to enter an integer.
- It should then determine whether the entered number is a prime number or not.
- The program should handle both positive and negative integers, considering that numbers less than or equal to 1 are not prime numbers.

### Example Input and Output

#### Test Case 1: Prime Number
**Input:**
```
Enter the number: 7
```
**Output:**
```
7 is a prime number.
```

#### Test Case 2: Not a Prime Number
**Input:**
```
Enter the number: 10
```
**Output:**
```
10 is not a prime number.
```

#### Test Case 3: Non-Prime Number (0 and 1)
**Input:**
```
Enter the number: 0
```
**Output:**
```
0 is not a prime number.
```

**Input:**
```
Enter the number: 1
```
**Output:**
```
1 is not a prime number.
```

#### Test Case 4: Negative Number (Not Prime)
**Input:**
```
Enter the number: -7
```
**Output:**
```
-7 is not a prime number.
```

### Explanation of the Code

The provided Java program reads an integer from the user and checks whether it is a prime number.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a number (`n`).

2. **Prime Check:**
   - The method `checkPrime` determines if the number is prime:
     - If `n` is less than or equal to 1, the method returns `false` since numbers less than or equal to 1 are not prime.
     - It loops from 2 to `n/2`, checking if `n` is divisible by any number in this range.
     - If `n` is divisible by any number, the method returns `false`, indicating `n` is not prime.
     - If no divisors are found, the method returns `true`, indicating `n` is prime.

### README.md for Git Repository

#### Prime Number Checker

This Java program checks whether a given integer is a prime number or not.

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
5. The program will determine if the entered number is a prime number or not and display the result.

### Example:
```
Enter the number: 7
7 is a prime number.
```

### Files Included:
- `Main.java`: Contains the Java code for the prime number checker program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if (checkPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
```