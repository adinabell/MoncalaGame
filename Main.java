package moncalaGame;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);

		//ask the user the players names
		System.out.println("What is player #1 name?");
				
	    
	     String player1Temp = input.nextLine();

	   // create a new player with by calling the constructors
	     Player player1 = new Player(player1Temp);
	     
	     System.out.println("What is player #2 name?");
			
	     String player2Temp = input.nextLine();
	     
	     Player player2 = new Player(player2Temp);

	     

	     

	
		MoncalaGame moncalaGame = new MoncalaGame(player1,player2);
		
		moncalaGame.gamePlay();
		
	
	
}
	
}
