package com.bridgelabz.programsforjunittesting;

import java.util.Scanner;

public class sqrt 
{

	public static void main(String[] args) 
	{
		double c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value to get square root");
		c = scanner.nextDouble();

		double t = c;
		double epsilon = 1.0e-15;
		while (Math.abs(t - c / t) > epsilon * t) 
		{
			t = (c / t + t) / 2.0;
		}

		System.out.println("square root of " + c + " is " + t);
	     
		scanner.close();

	}

}
