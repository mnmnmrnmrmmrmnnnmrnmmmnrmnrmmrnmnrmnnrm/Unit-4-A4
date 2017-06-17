package guessnumbers;

import java.util.Scanner;

public class guessnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner MyScanX=new Scanner(System.in);
		Scanner MyScanY=new Scanner(System.in);
		System.out.println("Number Guesser Program");
			System.out.println("Please enter your lower range: ");
		    int low= (MyScanX.nextInt())-1;
		    System.out.println("Please enter you're upper range: ");
		    System.out.println();
		    int high= (MyScanY.nextInt())+1;
		    int x= randomizer(low,high);    
		    int count=0;
		    int userGuess;
		    do{
		    	count++;
		    	System.out.println("what your guess ");
		    	userGuess =MyScanX.nextInt();
		    	if (userGuess>x)
		    	System.out.println("too high");
		    	if (userGuess<x)
		    	System.out.println("too low");
		    }while (userGuess != x);
		     System.out.println("Right ! It took you" +count+" amount of guess");
		    
	}
	public static Integer randomizer(int value1, int value2){
		int digit;
		do{
		digit=0;
		  digit=(int) ((Math.random()*value2)+1);
		  } while((digit>=value2)||(digit<=value1));
		   return (digit);
		} 
	
	}

