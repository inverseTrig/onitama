package onitama;

public class Card {
	
	private String name;
	private boolean isRed;
	private int[][] moves;
	
	public Card(String name, boolean isRed, int[][] moves) {
		this.name = name;
		this.moves = moves;
		this.isRed = isRed;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public boolean isRed() {
		return isRed;
	}


	public void setRed(boolean isRed) {
		this.isRed = isRed;
	}
	

	public int[][] getMoves() {
		return moves;
	}


	public void setMoves(int[][] moves) {
		this.moves = moves;
	}
	
}
