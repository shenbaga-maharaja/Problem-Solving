/**
	PROBLEM STATEMNT
	* Java Program To Find Multiples Of 3 And 5
	* If We List All The Natural Numbers Below 10 That Are Multiples Of 3 Or 5, 
		We Get 3, 5, 6 And 9. The Sum Of These Multiples Is 23.
	* Find The Sum Of All The Multiples Of 3 Or 5 Below The Provided Parameter Value Number.
	* Test Cases
		multiplesOf3and5(10) should return a number.
		multiplesOf3and5(49) should return 543.
		multiplesOf3and5(1000) should return 233168.
		multiplesOf3and5(8456) should return 16687353.
		multiplesOf3and5(19564) should return 89301183.
	* @shenbaga-maharaja
  	* Coded To Code
**/

import java.util.Scanner;

class MultiplesOf3and5{
	int sum(int number) {
	  int s=0,i;
	  for(i=1;i<number;i++){
	    if(i%3==0||i%5==0){
	      s+=i;
	    }
	  }
	  return s;
	  }

	public static void main(String[] args) {
		MultiplesOf3and5 ob = new MultiplesOf3and5();
		Scanner ip = new Scanner(System.in);
		System.out.print(" Enter The Value :");
		int c=ip.nextInt();
		System.out.println(ob.sum(c));
	}
}
