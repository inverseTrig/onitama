package onitama;

public class Hand {
	private Card[] hand;
	
	public Hand(int length) {
		hand = new Card[length];
		
	}
	
	public Hand() {
		hand = new Card[3];
	}
}
