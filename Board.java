package moncalaGame;

public class Board {
	
	//basic board layout
	
	private static int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
	private static char[] labels = {01,02,03,04,05,06,07,8,9,10,11,12,13,14};
	
	
	public static void printTopPlayer() {
		//print the labels
				for (int i =13; i>6; i--) {
					System.out.printf("*  %c",labels[i]);
					if (i == 13) {
						System.out.print("moncala ");
					}
				}
				
				//print the info
				for (int i =0; i<7; i++) {
					System.out.print(board[i]+ " ");
					
				}
				
	}

	public static void printBottomPlayer() {
		//print the labels
				for (int i =0; i<7; i++) {
					System.out.printf("*  %c",labels[i]);
					if (i == 6) {
						System.out.print("    moncala");
					}
				}
				
				//print the info
				for (int i =0; i<7; i++) {
					System.out.print(board[i]+ " ");
					
				}
				
	}

	
	public static void printBoard() {
		printTopPlayer();
		System.out.println();
		printBottomPlayer();
	}}

