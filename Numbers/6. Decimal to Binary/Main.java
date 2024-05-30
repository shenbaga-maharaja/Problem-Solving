import java.util.Scanner;

public class Main {

    public static void toBinary(int n) {
        if(n==0){
            System.out.print(0);
            return;
        }
        
        int binary[]=new int[32];
        int index=0;

        while(n>0){
            binary[index++]=n%2;
            n/=2;
        }

        for (int i=index-1;i>=0 ;i-- ) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Binary of " + n + " is: ");
        toBinary(n);
        System.out.println();
    }
}