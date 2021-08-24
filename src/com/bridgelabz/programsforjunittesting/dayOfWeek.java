package com.bridgelabz.programsforjunittesting;

public class dayOfWeek 
{

	public static void main(String[] args) 
	{
		
		int givenYear,givenMonth,givenDay;
		
		givenMonth=Integer.parseInt(args[0]);
		givenDay=Integer.parseInt(args[1]);
		givenYear=Integer.parseInt(args[2]);
		
		int y0,x,m0=0,d0;
		
		 y0 = givenYear - (14 - givenMonth) / 12;
		 x = y0 + y0/4 - y0/100 + y0/400;
		 m0 =givenMonth + 12 * ((14 - givenMonth) / 12) - 2;
		 d0 =(givenDay + x + (31*m0)/12) % 7;
		 
		 switch(d0)  
		    {   case 0:System.out.println("Sunday.\n");  
            		break;
		        case 1:System.out.println("Monday.\n");  
		                break;  
		        case 2:System.out.println("Tuesday.\n");  
		                break;  
		        case 3:System.out.println("Wednesday.\n");  
		                break;  
		        case 4:System.out.println("Thursday.\n");  
		                break;  
		        case 5:System.out.println("Friday.\n");  
		                break;  
		        case 6:System.out.println("Saturday.\n");  
		                break;  
		         
		    }  



	}

}

