package com.newlecture.ex12.oop;



public class App {
	public static void main(String[] args) {
		
		Board board = Board.make();
		board.deco();
		board.pirnt();
		
		int count = 0;
		boolean run = true;
		while(run) {
			board.putStone();
			board.pirnt();
			
		}
		board.save();
	}

}