package onitama;

import java.io.IOException;

public class Onitama {

	public static void main(String[] args) throws IOException {
		
		Deck deck = new Deck();
		deck.Reader();
		
		System.out.println(deck);
		
		System.out.println(deck.getDeck().size());
		
	}

}
