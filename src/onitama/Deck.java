package onitama;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	
	public void Reader() throws IOException {
		
		File f = new File(System.getProperty("user.dir") + "/carddetail.csv");
		
		try {
			Scanner scan = new Scanner(f);
			scan.useDelimiter("\n");
			
			while(scan.hasNext()) {
				String line = scan.next();
				String cells[] = line.split(",");
				
				boolean isRed = true;
				int moveSet = cells.length / 2 - 1;
				int[][] moves = new int[moveSet][2];
				if (!cells[1].equalsIgnoreCase("red")) {
					isRed = false;
				}
				
				for (int i = 0; 2+(2*i) < cells.length; i++) {
					moves[i][0] = Integer.parseInt(cells[2+(2*i)]);
					moves[i][1] = Integer.parseInt(cells[3+(2*i)]);
				}
				
				this.addCard(new Card(cells[0], isRed, moves));
			}

			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + f + "'");
		}	
	}
	
	public String toString() {
		String s = "";
		for (Card c : this.getDeck()) {
			s += c.toString() + "\n";
		}
		return s;
	}
	
}
