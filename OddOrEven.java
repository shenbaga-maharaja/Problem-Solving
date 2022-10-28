/**
	* @shenbaga-maharaja
  	* Coded To Code
	* Java Program To Find Given Number Is Odd Or Even
	* Test Cases
		num=2 should return Even.
		num=103 should return Odd.
		num=1000 should return Even.
		num=8457 should return Odd.
		num=19564 should return Even.
**/
class OddOrEven {
	public static void main(String[] args) {
		int num = 103;
		System.out.print(((num&1)!=1)==true?"Even":"Odd");
	}
}