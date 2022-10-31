package moncalaGame;

import java.util.Scanner;


public class MoncalaGame {
	
	private  Pit [] pits;
	
	private Scanner input = new Scanner(System.in);
	private int hand;
	private Player player1;
	private Player player2;
	
	
	public MoncalaGame(Player player1, Player player2) {
		
		
		this.player1=player1;
		
		this.player2 =player2;
		//create a scanner object to accept the users input
		
		
	     //create an array to hold all of the pits of the board 
	     
	     pits  = new Pit [14];
	     
	     // create a initial board set each pit to 4
	     
	     for (int i=0; i < pits.length; i++) {
	    	 	
	    	 
	    	 if (i== 6 || i==13) {
	    		 pits[i]= new Moncala();
	    	 }
	    	 else {
	    	 pits[i]= new Pit(4);
	    	 }
	    	 
				
			}
	  
	   
	     
	     
	     
	     
		
	}		
	//this method will display the board to the users with how many marbles are in each pit and the mancala
	
	public void displayBoard(){
		
		
		System.out.println(player2.getName() + " Mancala  Pit 0  Pit 1  Pit 2  Pit 3  Pit 4  Pit 5         ");
		System.out.println("       " + pits[13].getCount()+"       " + pits[0].getCount() +"      "+ pits[1].getCount() +"       "+ pits[2].getCount()+"       "+ pits[3].getCount()+"     "+ pits[4].getCount()+"    "+ pits[5].getCount());
		System.out.println("                                                                          ");
		
		System.out.println( "            Pit 12   Pit 11  Pit 10  Pit 9  Pit 8  Pit 7     "+ player1.getName() + " moncala");

		System.out.println( "              " +pits[12].getCount() +"       "+ pits[11].getCount() +"          "+ pits[10].getCount()+"     "+ pits[9].getCount()+"     "+ pits[8].getCount()+"     "+ pits[7].getCount()+"          "+ pits[6].getCount());


	
	}
	
	public void gamePlay() {
		
		int currentPlayer = 0;
		int [] player1Limit = new int [] {0,5};
		int [] player2Limit = new int [] {7,12};
		Player player ;
		int currPit = 0;
		
		
		while (true != gameFineshed() ) {
			displayBoard();
			
			if (currentPlayer== 0){
				player = player1;
				int[] limit = player1Limit;			
			}
			else {
				 player = player2;
				int [] limit = player2Limit;
			}
			
			
			System.out.println( player.getName() + " from which pit would you like to remove pebbles from your side in pits " +
			     		"/ pebbles get distributed from the pit going towards your mancala -increasing order");
			     
			
		     int pitChoice = input.nextInt();
		     
		     currPit= pitChoice;
		     //for( statr = currentSpot 
		     
		     
		    int nextSpot = pitChoice +1 ;
		     
		     
		     hand = pits[pitChoice].getCount();
		     pits[pitChoice].setCount(0);
		     
		     while (hand != 0)
		     {
		    	
		    	 //where do i put in this for loop 
		    	// for (int i= currPit; i<hand; i++) {
		    		// currPit = (pitChoice+i)% 14;
		    	// }
		    	 //i dont chap how to do it all in the if with out haveing all these conditions
		    	 if (nextSpot != 6 && nextSpot != 13 ) {
		    		pits[nextSpot].addMarble();
		    		hand--;}
		    		else if((nextSpot == 6 && currentPlayer ==0) || (nextSpot == 13 && currentPlayer ==1)) {
		    			
		    			pits[nextSpot].addMarble();
			    		hand--;}
		    		
		    		
		    	
		    	 

				  currPit = nextSpot;

		    	 
		    	 
		    	 nextSpot =(nextSpot+1)% 14 ;
		    	 
		    	
		     }
		     
		
		   System.out.println(currPit );
		   System.out.println(nextSpot);
		    
		    
		    if ( currPit != 6 && currPit != 13  ) {
		    	 System.out.println("first if");
		    	  int  currPeices=pits[currPit].getCount();
				    
		    if (currPeices == 1) {
			    	System.out.println("secound if");
				    	int oppoSpot = 12 - currPit;
				    	int collectionPeices = pits[oppoSpot].getCount() + 1;
				    	pits[oppoSpot].setCount(0);
				    	if (currentPlayer ==0 ) {
				    	pits[6].setCount(collectionPeices);}
				    	else {
					    	pits[13].setCount(collectionPeices);
      }
					    	
				    	}
			    currentPlayer = (currentPlayer+1) % 2;
			    
				   System.out.println("Switching current Player");

		    
		 
		   
		   
		}
		 
		    }}
		
		//if (getWinner() == 0) {
			//System.out.println(player1 + "has WON the game!!!");
		//}
		//else {
		//	System.out.println(player2 + "has WON the game!!!");

		//}
	
		
	
	
	
		public Boolean gameFineshed() {
			if ((pits[0].getCount() == 0 && pits[1].getCount() == 0 && pits[2].getCount() == 0 && pits[3].getCount() == 0 && pits[4].getCount() == 0 && pits[5].getCount() == 0 ) || 
					(pits[7].getCount() == 0 && pits[8].getCount() == 0 && pits[9].getCount() == 0 && pits[10].getCount() == 0 && pits[11].getCount() == 0 && pits[12].getCount() == 0)) {
				getWinner();
				
				
				return true;
			}
			else {
				return false;
			}

		}
		public int getWinner() {
			if (pits[0].getCount() == 0 && pits[1].getCount() == 0 && pits[2].getCount() == 0 && pits[3].getCount() == 0 && pits[4].getCount() ==0 && pits[5].getCount() == 0) {
				return 0;
			}
			return 1;
			
		
			
			
			
			
		}
	

}
