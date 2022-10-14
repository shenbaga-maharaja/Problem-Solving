/**
  * Java Program To Calculate Area Of The Ciecle
  * @shenbaga-maharaja
  * Coded To Code
**/

import java.util.Scanner;

class AreaOfTheCircle{
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter Radius Of Circle : ");
		Double radius = r.nextDouble();

		Double area = Math.PI * radius * radius;
		System.out.println("Area Of The Circle = "+area);
	}

}