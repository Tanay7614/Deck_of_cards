package sample;

import java.util.Random;

//import java.util.Random;

public class Cards {
	String[][] shufleCards=new String[10][20];
	
	// shuffling the cards
	public static String[] shuffle(String name[]){
		Random ran = new Random();
		
		for (int i=0;i<52;i++) {
		int r= i+ran.nextInt(52-i);
		String temp=name[r];
		name[r]=name[i];
		name[i]=temp;
		}
		
		return name;
	}
	
	// Distribute the Cards
	public void	disti(String name2[])
	{
		int k=0;
		for (int i=0;i<4;i++) {
			for (int j=0;j<9;j++) {
			shufleCards[i][j]=name2[k];
			k++;
			}
		}
		// Display the distribute cards
		for (int i=0;i<4;i++) {
			for (int j=0;j<9;j++) {
				System.out.print(shufleCards[i][j]+" ");	
			}
			System.out.println();
			System.out.println("                -----------------------||----------------------          ");
			}
		}
	
}
