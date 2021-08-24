package com.bridgelabz.programsforjunittesting;

import java.util.Scanner;

public class temperaturConversion 
{

	public static void main(String[] args) 
	{
		int inputTemperature=0;

		System.out.println("Enter 1 to convert from celsius to Fahrenheit and 2 to convert Fahrenheit to celsius");
		Scanner scanner = new Scanner(System.in);
		int input=scanner.nextInt();
		System.out.println("Enter temperature value");
		inputTemperature=scanner.nextInt();
		
		switch (input)
		{
		
			case 1:int toFahrenheit = ((inputTemperature*9)/5)+32;
				   System.out.println("Fahrenheit equivalent of "+inputTemperature+" is"+toFahrenheit);
				
				break;
	
			case 2:int toCelsius = ((inputTemperature - 32)*5)/9;  
				   System.out.println("Celsius equivalent of "+inputTemperature+" is"+toCelsius);

				break;
		}
	}

}
