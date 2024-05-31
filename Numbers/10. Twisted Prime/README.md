### Problem Statement: Twisted Prime Checker

#### Description:
A twisted prime is a prime number that remains prime when its digits are reversed. For example, 13 is a twisted prime because both 13 and 31 are prime.

Write a Java program to determine whether a given integer is a twisted prime or not.

#### Requirements:
- The program should prompt the user to enter an integer.
- It should then determine whether the entered number is a twisted prime or not.
- The program should handle both positive and negative integers.

### Example Input and Output

#### Test Case 1: Twisted Prime
**Input:**
```
Enter the number: 13
```
**Output:**
```
13 is a prime number.
13 is a twisted prime number.
```

#### Test Case 2: Not a Twisted Prime
**Input:**
```
Enter the number: 23
```
**Output:**
```
23 is a prime number.
23 is not a twisted prime number.
```

#### Test Case 3: Prime but Not Twisted Prime
**Input:**
```
Enter the number: 17
```
**Output:**
```
17 is a prime number.
17 is not a twisted prime number.
```

#### Test Case 4: Not a Prime Number
**Input:**
```
Enter the number: 12
```
**Output:**
```
12 is not a prime number.
12 is not a twisted prime number.
```

#### Test Case 5: Negative Integer
**Input:**
```
Enter the number: -101
```
**Output:**
```
-101 is not a prime number.
-101 is not a twisted prime number.
```

### Explanation of the Code

The provided Java program reads an integer from the user and checks whether it is a twisted prime number.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a number (`n`).

2. **Prime Check:**
   - The method `isPrime` checks if a number is prime or not:
     - If the number is less than or equal to 1, it's not prime.
     - It iterates from 2 to the square root of the number to check for factors. If any factor is found, the number is not prime.
     - If no factors are found, the number is prime.
   - The method `isTwistedPrime` checks if a number is twisted prime or not:
     - It first checks if the number is prime using the `isPrime` method.
     - If the number is prime, it reverses the digits of the number using the `reverseNumber` method.
     - It then checks if the reversed number is also prime.
     - If both conditions are met, the number is a twisted prime.

### README.md for Git Repository

#### Twisted Prime Checker

This Java program checks whether a given integer is a twisted prime number or not.

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
5. The program will determine if the entered number is a twisted prime number or not and display the result.

### Example:
```
Enter the number: 13
13 is a prime number.
13 is a twisted prime number.
```

### Files Included:
- `Main.java`: Contains the Java code for the twisted prime checker program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static boolean isTwistedPrime(int n) {
        boolean res = isPrime(n);
        if (res == true) {
            System.out.println(n + " is a prime number.");
        }
        return res && isPrime(reverseNumber(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int d = n % 10;
            reversed = reversed * 10 + d;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if (isTwistedPrime(n)) {
            System.out.println(n + " is a twisted prime number.");
        } else {
            System.out.println(n + " is not a twisted prime number.");
        }
        s.close();
    }
}
```