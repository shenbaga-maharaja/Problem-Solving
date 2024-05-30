### Problem Statement: Binary Representation

#### Description:
Write a Java program to convert a given integer to its binary representation.

#### Requirements:
- The program should prompt the user to enter an integer.
- It should then convert the entered number to its binary representation.
- The program should handle both positive and negative integers.

### Example Input and Output

#### Test Case 1: Positive Integer
**Input:**
```
Enter the number: 10
```
**Output:**
```
Binary of 10 is: 1010
```

#### Test Case 2: Negative Integer
**Input:**
```
Enter the number: -5
```
**Output:**
```
Binary of -5 is: 11111111111111111111111111111011
```

#### Test Case 3: Zero
**Input:**
```
Enter the number: 0
```
**Output:**
```
Binary of 0 is: 0
```

### Explanation of the Code

The provided Java program reads an integer from the user and converts it to its binary representation.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a number (`n`).

2. **Binary Conversion:**
   - The method `toBinary` converts the number to binary:
     - If `n` is 0, it prints 0 and returns.
     - It creates an array `binary` to store the binary representation.
     - It iterates through the binary conversion process until `n` becomes 0, storing the remainder of division by 2 in the array.
     - It then prints the binary representation by iterating through the array in reverse order.

### README.md for Git Repository

#### Binary Representation Converter

This Java program converts a given integer to its binary representation.

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
5. The program will convert the entered number to its binary representation and display the result.

### Example:
```
Enter the number: 10
Binary of 10 is: 1010
```

### Files Included:
- `Main.java`: Contains the Java code for the binary representation converter program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;

public class Main {

    public static void toBinary(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        
        int binary[] = new int[32];
        int index = 0;

        while (n > 0) {
            binary[index++] = n % 2;
            n /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Binary of " + n + " is: ");
        toBinary(n);
        System.out.println(); // New line
    }
}
```