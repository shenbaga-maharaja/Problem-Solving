/**
  * Java Program To Convertion Of Farenheit To Celcius
  * @shenbaga-maharaja
  * Coded To Code
  * Input And Output
	Enter The Value Of Farenheit :80
	Celcius :26.666666666666668
**/

import java.util.Scanner;

class FarenheitToCelcius{
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.print("Enter The Value Of Farenheit :");
		Double farenheit = f.nextDouble();

		Double celcius = (farenheit-32)*5/9;
		System.out.println("Celcius :"+celcius);
	}
}