/**
	* @shenbaga-maharaja
  	* Coded To Code
	* Java Program To Find Count Bits In The Given Number
	* Given Number ,
			num = 1010101 ;
			Bit 1 Count = 4 , Bit 0 Count = 3;
**/
import java.util.Scanner;
class CountBits {
	static int countBits(long num,int digit){
		int count=0;
		while(num>0){
			if(num%10==digit){
				count+=1;
			}
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter A Number:");
		long num=ip.nextLong();
		int digit0=0,count0 = countBits(num,digit0);
		int digit1=1,count1 = countBits(num,digit1);
		System.out.println("Bit "+digit0+" Count"+":"+count0);
		System.out.println("Bit "+digit1+" Count"+":"+count1);
	}
}