import java.util.Scanner;

public class Main {

    public static int findGCD(int a,int b) {
        if(b==0)
            return a;
        return findGCD(b,a%b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int a = s.nextInt();
        System.out.print("Enter the number2: ");
        int b = s.nextInt();
        System.out.print("GCD of " + a +" and " + b + " is " + findGCD(a, b));
        
    }
}