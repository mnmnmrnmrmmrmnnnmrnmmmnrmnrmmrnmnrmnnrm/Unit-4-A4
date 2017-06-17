package reducingfractions;

import java.util.Scanner;

public class reducefraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MyScanUser=new Scanner(System.in);//scanner for the numerator
		Scanner MyScanUser2=new Scanner(System.in);//scanner for the denominator
		
		System.out.println("Reduce Fraction\n"
				+"================");
		System.out.println();
		System.out.println("This program will reduce a fraction to its lowest terms.");
		System.out.println();
		
		System.out.println("Enter the numerator");
		int numerator=MyScanUser.nextInt();
		
		System.out.println("Enter the denominator");
		int denominator=MyScanUser2.nextInt();
				
		System.out.println("You've entered "+numerator+"/"+denominator);
		
		System.out.println("GCM: "+ gcm(numerator,denominator) + ".");
		System.out.println("Lowest form:"+numerator/gcm(numerator,denominator)+"/"+denominator/gcm(numerator,denominator));
		
	}
public static int gcm(int numerator,int denominator){
	
	 if(numerator == 0 || denominator == 0) 
		 return (numerator+denominator); // In case one of the values is a zero
	
	 int gcd = 1;

	    if(numerator>denominator)
	    {
	        for(int i = denominator; i >=1; i--)
	        {
	            if(numerator%i==0 && denominator%i ==0)
	            {
	                return i;
	            }
	        }
	    }
	    else
	    {
	        for(int j = numerator; j >=1; j--)
	        {
	            if(numerator%j==0 && denominator% j==0)
	            {
	                return j;
	            }
	        }
	    }   
	    return gcd;

	
	
	
}
	
	
}
