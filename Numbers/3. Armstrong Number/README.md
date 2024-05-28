### Problem Statement: Armstrong Number

#### Description:
An Armstrong number (also known as a narcissistic number or pluperfect number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

Write a Java program to determine whether a given integer is an Armstrong number or not.

#### Requirements:
- The program should prompt the user to enter an integer.
- It should then determine whether the entered number is an Armstrong number or not.
- The program should handle both positive and negative integers, considering that negative numbers cannot be Armstrong numbers.

### Example Input and Output

#### Test Case 1: Armstrong Number
**Input:**
```
Enter the number: 153
```
**Output:**
```
Armstrong
```

#### Test Case 2: Not an Armstrong Number
**Input:**
```
Enter the number: 123
```
**Output:**
```
Not Armstrong
```

#### Test Case 3: Single Digit Number (Armstrong by default)
**Input:**
```
Enter the number: 5
```
**Output:**
```
Armstrong
```

#### Test Case 4: Negative Number (Not Armstrong)
**Input:**
```
Enter the number: -153
```
**Output:**
```
Not Armstrong
```

### Explanation of the Code

The provided Java program reads an integer from the user and checks whether it is an Armstrong number.

1. **Input Handling:**
   - The program uses `Scanner` to read input from the user.
   - It prompts the user to enter a number (`n`).

2. **Armstrong Check:**
   - The program calculates the number of digits in the input number.
   - It then computes the sum of each digit raised to the power of the total number of digits.
   - If the computed sum equals the original number, the number is an Armstrong number; otherwise, it is not.

### README.md for Git Repository

#### Armstrong Number Checker

This Java program checks whether a given integer is an Armstrong number or not.

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
5. The program will determine if the entered number is an Armstrong number or not and display the result.

### Example:
```
Enter the number: 153
Armstrong
```

### Files Included:
- `Main.java`: Contains the Java code for the Armstrong number checker program.
- `README.md`: Provides instructions and information about the program.

### Contributions:
Contributions to improve this program are welcome. If you find any bugs or have suggestions for enhancements, feel free to open an issue or submit a pull request.

### Complete Code

```java
import java.util.Scanner;
import java.lang.Math;  

public class Main {

    public static boolean ifArmstrong(int n){
        int temp, digits=0, last=0, sum=0;

        temp=n;  
        while(temp>0) {   
            temp = temp/10;   
            digits++;   
        }   

        temp = n;   
        while(temp>0) {         
            last = temp % 10;     
            sum +=  (Math.pow(last, digits)); 
            temp = temp/10;   
        }   

        if(n==sum){
            return true;
        } else {
            return false;  
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if(ifArmstrong(n)){
            System.out.print("Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }
    }
}
```

This code ensures that the program behaves correctly for various values of `n`, including edge cases for single-digit numbers and negative numbers.