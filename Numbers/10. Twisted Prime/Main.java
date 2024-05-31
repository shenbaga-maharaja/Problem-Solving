import java.util.Scanner;

public class Main {

    public static boolean isTwistedPrime(int n) {
        boolean res = isPrime(n);
        if(res==true){
            System.out.println(n + " is a prime number.");
        }
        return res && isPrime(reverseNumber(n));
    }

    public static boolean isPrime(int n){
        if(n<=1){
            System.out.println(n + " is not a prime number.");
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(n + " is not a prime number.");
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int n){
        int reversed=0;
        while(n!=0){
            int d = n % 10;
            reversed = reversed*10 + d;
            n/=10;
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