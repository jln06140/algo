package exoPart1;

import java.util.Random;

public class Exo9 {
	
	
	
	public static void tri(int tab[]) {
		
	}
	
	public static boolean estEgale(int tab[], int indice) {
		boolean estEgal = false;
		int ind = indice;
		
		for(int i=0;i<ind;i++) {										
			for(int k =0;k<i;k++) {											
				if(tab[i] == tab[k]) {										
					tab[i]  = (int) (Math.random() * 6);
					estEgal = true;										
				}
			}
			
			for(int j=i+1; j<tab.length; j++) {								
				if(tab[i] == tab[j]) {
					tab[i]  = (int) (Math.random() * 6);					
					estEgal = true;
				}
				
			}
			
			
		}
		return estEgal;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("generation de 6 chiffres aleatoire");
		int tab[] = new int[6];
		
		for(int i=0; i<tab.length;i++) {	//creation tableau aleatoire de 6 chiffres de 0 a 40
			tab[i] = (int) (Math.random() * 6);
		}
		
		for(int i=0; i<tab.length;i++) {	//lecture tableau
			System.out.println(tab[i]);
		}
		
		for(int i =0;i<tab.length;i++) {
			if(estEgale(tab,i)) i=0;
		}
		
		
		System.out.println("tableau avec 6 chiffres differents :");
		
		for(int i=0; i<tab.length;i++) {	//lecture tableau
			System.out.println(tab[i]);
		}
		
		
	}

}
