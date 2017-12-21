package onitama;

import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> deck;
	
	public Deck() {
		this.deck = new ArrayList<Card>();
	}
	
	public void addCard(Card newCard) {
		deck.add(newCard);
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}
	
}
