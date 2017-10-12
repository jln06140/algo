package exoPart1;

import java.util.Scanner;

public class Exo17 {

	public static void main(String[] args) {
		
		
		int max =1000000;
		int min = 0;
		int cpt=65;
		boolean trouve = false;
		
		int n = 66;
		
		int milieu = max/2;
		
		while(trouve == false) {
			if(n>milieu) {
				min = milieu;
				milieu = min +(max - min)/2;
				cpt++;
			}
			else if(n<milieu) {
				max = milieu;
				milieu = min +(max - min)/2;
				cpt++;

			}
			else {
				trouve =true;
				
			}
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("choisissez intervalle min");
		int x = scan.nextInt();
		System.out.println("choisissez intervalle min");
		int y = scan.nextInt();
		
		
		

	}

}
