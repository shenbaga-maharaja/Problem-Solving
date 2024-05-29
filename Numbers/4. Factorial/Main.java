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
