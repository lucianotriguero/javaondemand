package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Arrays;

public class ArrayM4210CardClient {

	public static void main(String[] args) {
		
		Card c1 = new Card(3,0);
		Card c2 = new Card(11,2);
		
		System.out.print(" The first card is: " +c1.toString());
		System.out.print("The second card is: " +c2.toString());
		
		System.out.println();
		System.out.println("The second card is: " +c1.compareTo(c2));

		ExternJfrCard jfr = new ExternJfrCard();  //Skapar en extern jämförare
		if (jfr.compare(c1,c2) < 0 ) {
			System.out.println("Det första kortet har a mindre rank");
		}
		
		//Array of Card objects (A Deck of cards)
		Card[] kortBunt = new Card[52];
		
		System.out.println("Sorting with compareTo");
		kortBunt = Card.makeDeck();
		Arrays.sort(kortBunt);
		Card.printDeck(kortBunt);
		
		System.out.println("Sorting with Extern comparator");
		Arrays.sort(kortBunt, new ExternJfrCard());
		Card.printDeck(kortBunt);

		//System.out.println();
		//System.out.println(Arrays.toString(kortBunt));

	}

}
