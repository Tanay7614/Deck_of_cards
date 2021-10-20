package sample;

//import java.util.ArrayList;

public class DeckOfCards {
  
public static void main(String[] args) {
	
	int p=0;
	int j=0;
	int[] deck= {2,3,4,5,6,7,8,9,10} ;
	String[] card= {"jack","queen","king","Ace"};
	String[] suit= {"Club","Diamond","Hearts","Spades"};
	String[] name=new String[52];


	//  Creating a Cards
	for(int i=0;i<deck.length;i++) {
		 p=j;
		for( j=0;j<suit.length;j++) {
			name[p*i+j]=deck[i]+" "+suit[j];
		}
	}
    //  Creating a Cards
	int i=-1;
	for(int x=9;x<13;x++) {
		p=4;
		i++;
		for( j=0;j<suit.length;j++) {
			name[p*x+j]=card[i]+" "+suit[j];
		}
	}
	Cards cards=new Cards();
	String[] shuffleCards =Cards.shuffle(name);
	
	// Display the Shuffle Cards
	for(i=0;i<52;i++)
    {
		System.out.println(shuffleCards[i]);
	}
	System.out.println("Didtribute the 9 Card to 4 player!! ");
	
	//  Call to distribute cards
	cards.disti(shuffleCards);
	
	}
} 


