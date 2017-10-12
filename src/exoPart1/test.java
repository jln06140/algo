package exoPart1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import co.simplon.recall.PlayingWithAlgo;

public class test {

	public static void main(String[]args) {
		String text = "'All the world's a stage', 'rail at a liar', 'Tis the time's plague when madmen lead the blind', 'Did Hannah see bees ? Hannah did', 'Sums are not set as a test on Erasmus' " ;
		numberOfPalindromeText(text);
		
		
	}
	
	

	public static void numberOfPalindromeText(String text) {
		String tab[] = text.split(" ");
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
			
		}
		
	}
	}


