import java.util.Scanner;

public class Main {

    public static boolean isAutomorphic(int n) {
        int square = n*n;
        while(n>0){
            if(n%10!=square%10)
                return false;
            n/=10;
            square/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if(isAutomorphic(n)){
            System.out.println(n+" is an Automorphic Number");
        }
        else{
            System.out.println(n+" is Not an Automorphic Number");
        }
    }
}