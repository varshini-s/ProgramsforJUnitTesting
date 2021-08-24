package com.bridgelabz.programsforjunittesting;

public class monthlyPayment
{

	public static void main(String[] args)
	{
		double principalAmount = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);
	
        double n = 12 * years;  
        double r = rate/(12*100);
             


		 double payment  = (principalAmount * r) / (1 - Math.pow(1+r, -n));
		 System.out.println("Monthly payments = " + payment);
	}

}

