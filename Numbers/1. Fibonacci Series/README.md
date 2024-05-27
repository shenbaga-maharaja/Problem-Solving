# Fibonacci Series Generator

This Java program generates and prints the Fibonacci series up to a given number of terms. The program prompts the user to enter a positive integer `n`, which specifies the number of terms of the Fibonacci series to generate. The Fibonacci series starts with 0 and 1, and each subsequent term is the sum of the previous two terms.

## Requirements

- The program handles invalid input (non-positive integers) gracefully.
- If `n` is 1, the program prints only the first term (0).
- If `n` is 2, the program prints the first two terms (0 and 1).
- For `n` greater than 2, the program prints the first `n` terms of the Fibonacci series.

## Example Input and Output

### Test Case 1
**Input:**
```
Enter the number: 1
```
**Output:**
```
Fibonacci Series: 0
```

### Test Case 2
**Input:**
```
Enter the number: 2
```
**Output:**
```
Fibonacci Series: 0 1
```

### Test Case 3
**Input:**
```
Enter the number: 5
```
**Output:**
```
Fibonacci Series: 0 1 1 2 3
```

### Test Case 4
**Input:**
```
Enter the number: 10
```
**Output:**
```
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
```

### Test Case 5 (Invalid Input)
**Input:**
```
Enter the number: 0
```
**Output:**
```
Please enter a positive integer.
```

**Input:**
```
Enter the number: -5
```
**Output:**
```
Please enter a positive integer.
```

## Explanation of the Code

The provided Java program reads an integer `n` from the user and generates the first `n` terms of the Fibonacci series.

### Input Handling
- The program uses `Scanner` to read input from the user.
- It prompts the user to enter a number (`n`).

### Edge Cases
- If `n` is less than or equal to 0, the program prints a message asking for a positive integer and terminates.

### Generating Fibonacci Series
- If `n` is greater than 0, the program initializes the first two terms (`a = 0`, `b = 1`).
- It then uses a for loop to generate the next terms by adding the two previous terms (`next = a + b`) and updating `a` and `b` accordingly.
- The terms are printed in sequence.

## Code

```java
import java.util.Scanner;

public class Main {
    public static void fib(int n){
        if(n <= 0){
            System.out.println("Please enter a positive integer.");
            return;
        }
        int a = 0, b = 1;
        if (n == 1) {
            System.out.print("Fibonacci Series: " + a);
        } else {
            System.out.print("Fibonacci Series: " + a + " " + b);
        }
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        fib(n);
    }
}
```

## How to Run

1. Copy the provided code into a file named `Main.java`.
2. Compile the program using the following command:
   ```
   javac Main.java
   ```
3. Run the compiled program:
   ```
   java Main
   ```
4. Enter a positive integer when prompted to generate the Fibonacci series up to the specified number of terms.
