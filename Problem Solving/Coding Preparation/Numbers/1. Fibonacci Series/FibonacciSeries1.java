//Fibonacci Series in Java without using recursion
//eat(); sleep(); code(); repeat(); with @shenbaga-maharaja

class FibonacciSeries1{
	public static void main(String[] args) {
		int a=0,b=1,c,x=10;
		System.out.print(a+" "+b);//printing 0 and 1
		for (int i=2;i<x;i++) {//loop starts from 2 because 0 and 1 are already printed
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}