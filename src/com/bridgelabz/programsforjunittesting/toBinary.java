package com.bridgelabz.programsforjunittesting;

import java.util.Scanner;

public class toBinary 
{

	public static void main(String[] args) 
	{
		int power = 1;
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal value to convert to binary");
        int inputDecimalNumber=scanner.nextInt();

        while (power <= inputDecimalNumber/2) 
        {
            power *= 2;
        }
        
  
        while (power > 0) 
        {

            if (inputDecimalNumber < power) 
            {
                System.out.print(0);
            }

            else 
            {
                System.out.print(1);
                inputDecimalNumber -= power;
            }

            power /= 2;
        }

       
		scanner.close();

	}

}
