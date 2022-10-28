/**
	* @shenbaga-maharaja
  	* Coded To Code
	* Java Program To Find KrishnaMurthy Number
	* Given Number ,
			num = 145 
			145 === 1!+4!+5! = 145 // 145 == 145
			50 === 5!+0! = 121 // 50 != 121
**/
class KrishnaMurthyNumber{
	static int factorial(int digit){
		int fact=1;
		while(digit>0){
			fact=fact*digit;
			digit--;
		}
		return fact;
	}
	static boolean checkKM(int num){
		int sum=0,temp=num;
		while(num>0){
			sum = sum + factorial(num%10);
			num = num/10;
		}
		if (sum==temp) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(checkKM(145));//true
		System.out.println(checkKM(50));//false
	}
}