package onitama;

public class Board {
	
	public Pawn[][] board;
	
	public Board(int dimension) {
		board = new Pawn[dimension][dimension];
		
		// Populate the Board with Pawns
		if (dimension == 5) {
			for (int i = 0; i < 5; i++) {
				if (i == 2) {								// If center of board,
					this.addPawn(false, true, 0, i);		// Blue Master Pawn
					this.addPawn(true, true, 4, i);			// Red Master Pawn
				}
				else {
					this.addPawn(false, false, 0, i);		// Blue Pawn
					this.addPawn(true, false, 4, i);		// Red Pawn
				}
				
			}
		}
	}
	
	public void removePawn(int x, int y) {
		this.board[x][y] = null;
	}
	
	public void addPawn(boolean isRed, boolean isMaster, int x, int y) {
		this.board[x][y] = new Pawn(isRed, isMaster);
	}
	
	public Pawn getPawn(int x, int y) {
		return this.board[x][y];
	}
	
}
