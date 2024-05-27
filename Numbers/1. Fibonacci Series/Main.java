import java.util.Scanner;

public class Main {
	public static void fib(int n){
    	if(n<=0){
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
