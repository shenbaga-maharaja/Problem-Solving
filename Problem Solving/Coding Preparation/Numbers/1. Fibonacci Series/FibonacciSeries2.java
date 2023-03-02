//Fibonacci Series using recursion in java
//eat(); sleep(); code(); repeat(); with @shenbaga-maharaja

class FibonacciSeries2{
	static int a=0,b=1,c=0;
	static void fibSeries(int x){
		if (x>0) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibSeries(x-1);
		}
	}

	public static void main(String[] args) {
		int x=10;
		System.out.print(a+" "+b);//printing 0 and 1
		fibSeries(x-2);//n-2 because 2 numbers are already printed
	}
}