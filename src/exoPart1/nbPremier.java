package exoPart1;

import java.util.Scanner;

public class nbPremier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("renter un chiffre pour obtenir nombre premier");
		int n = scan.nextInt();
		String res="";
		int cpt=0;
		
		for(int i=1 ; i<= n ;i++)
		{
			if(i == 1 || i == 2)
			{
				res += " "+i;
				cpt++;
			}
			else if (estPremier(i))
			{
				res += " "+i;
				cpt++;
			}
		
		}
		
		System.out.println(res);
		System.out.println("il y "+ cpt +" chiffres premiers avant "+n);
				
	}
	
	public static boolean estPremier(int n) {
		boolean retour = true;
		if(n> 2) {
			for (int i=2; i<n-1; i++) {
				if (n%i == 0) retour = false;  
			}
		}
		return retour;
		
	}
	
	

}
