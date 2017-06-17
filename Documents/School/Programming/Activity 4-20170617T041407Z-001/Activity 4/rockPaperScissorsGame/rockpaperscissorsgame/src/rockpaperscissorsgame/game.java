/* name: Josh Pye 
 * course code: ICS3U
 * teacher: Mr.kuzmochka
 * date: may 15 2017
 * description: this is a game of rock paper scissors where the user plays
 * against the cpu, which is controlled by a random number generator
 */ 
package rockpaperscissorsgame;

import java.util.Scanner;

public class game {
	
	public static String compMove;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MyScanUser=new Scanner(System.in);
		System.out.println("1=Rock 2=Paper 3=Scissors"
				+ "\n\nEnter your move");
		int human=0;//human choice
		human= MyScanUser.nextInt();
		
		
		int comp=0;// variable for the computers choice

		
		/* 
		 * Following block of code calls the methods that determine the game
		 * results depending on the chosen moves and then prints them.
		 */
		String ending; 
		ending=randomGen(human,comp) ; 
		System.out.println(ending); 	
	}
	public static String randomGen(int human,int comp){	
		comp= (int) ((Math.random()*3)+1);  
		System.out.println();
		compMove= compMove(comp);
		System.out.println(compMove);
		if(comp==1 && human==2)
			return("Winner!!");
		if(comp==1 && human==3)
			return("Loss :(");
		if(comp==2&&human==3)
			return("Winner!!");
		if(comp==2&&human==1)
			return("Loss :(");
		if(comp==3&&human==2)
			return("Loss :(");
		if(comp==3&&human==1)
			return("Winner!!");
		return("Stalemate");	}
	public static String compMove(int comp){
		if (comp==1)
		return compMove="The computer played rock";
		if (comp==2)
		return compMove="The computer played Paper.";
		if (comp==3)
		return compMove="The computer played Scissors";
		return "";
	}
}
		





	