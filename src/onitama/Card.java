package onitama;

public class Card {
	
	private int[][] moves = new int[10][2];
	private boolean isRed;
	
	public Card(int[][] moves, boolean isRed) {
		this.moves = moves;
		this.isRed = isRed;
	}


	public int[][] getMoves() {
		return moves;
	}


	public void setMoves(int[][] moves) {
		this.moves = moves;
	}


	public boolean isRed() {
		return isRed;
	}


	public void setRed(boolean isRed) {
		this.isRed = isRed;
	}
	
}
