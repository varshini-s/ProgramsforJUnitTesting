package com.bridgelabz.programsforjunittesting;

import java.util.Scanner;

public class Binary 
{
	public static String toBinary(int inputDecimalNumber)
	{
		int power = 1;
		String binaryEquivalent="";

        while (power <= inputDecimalNumber/2) 
        {
            power *= 2;
        }
        
  
        while (power > 0) 
        {

            if (inputDecimalNumber < power) 
            {
            	binaryEquivalent=  binaryEquivalent+"0";
            }

            else 
            {
            	binaryEquivalent= binaryEquivalent+"1";
                inputDecimalNumber -= power;
            }

            power /= 2;
        }

       
		return binaryEquivalent;
	}

	public static void main(String[] args) 
	
	{	
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal value to convert to binary");
        int inputDecimalNumber=scanner.nextInt();
        String binaryString=toBinary(inputDecimalNumber);
        
        while(binaryString.length()<8)
        {
        	binaryString="0"+binaryString;
        	
        }
        
        String firstNibble = binaryString.substring(0,4);
        String secondNibble= binaryString.substring(4,8);
        String swappedNibbles=secondNibble+firstNibble;
        
        //to convert to decimal
        int decimal=Integer.parseInt(swappedNibbles,2); 
        
        System.out.println("Decimal value after swapping nibbles is "+decimal);
        //to check if its a power of 2
        if((decimal & (decimal - 1))==0)
        	
        {
        	System.out.println("converted number "+decimal+" is  a power of 2");
        }
        else
        {
        	System.out.println("converted number "+decimal+" is not a power of 2");
        }
        	
       

        scanner.close();
	}

}
