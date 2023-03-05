//Palindrome Number in Java 
//eat(); sleep(); code(); repeat(); with @shenbaga-maharaja

import java.util.*;
class PalindromeNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number - ");
		int n=sc.nextInt();
		int r,s=0,t;
		t=n;
		while(n>0){
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if (t==s) {
			System.out.println(t +" is a Palindrome");
		} else{
			System.out.println(t +" is not a Palindrome");
		}
	}
}