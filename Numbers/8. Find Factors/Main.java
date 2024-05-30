import java.util.Scanner;

public class Main {

    public static void findFactors(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Factors of " + n + " are: ");
        findFactors(n);
    }
}