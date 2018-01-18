package onitama;

import java.io.IOException;

public class Onitama {

	public static void main(String[] args) throws IOException {
		
		Deck deck = new Deck();
		Board b1 = new Board(5);
		deck.Reader();
		
		System.out.println(deck);
		System.out.println(b1);
		
		System.out.println(b1.getPawn(0, 2));
		
		System.out.println(deck.getDeck().size());
		
	}
}
