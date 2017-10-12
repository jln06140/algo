package exoPart1;

import java.util.Scanner;


	
public class Exo11 {
	
	public static boolean contientChiffre(String s) {
		char tab[] = {'0','1','2','3','4','5','6','7','8','9'};
		boolean vrai = false;
		while(!vrai) {
			for(int j=0; j<s.length(); j++) {
				char c= s.charAt(j);
 				for(int i=0;i<tab.length;i++) {
					if (tab[i] == c) {
						vrai=true;
					}
			}
			
			}
		}
		return vrai;
		
	}
	
	public static String departementSecu(String s) {
		String res="";
		if(contientChiffre(s)) {
			char c1 = s.charAt(5);
			char c2 = s.charAt(6);
			res = c1 +"" +c2; 
		}
		return res;
	}
	
		
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entre numero de secu");
		String s = scan.nextLine();
		
		while (!(s.length() == 15 && contientChiffre(s))) {
			System.out.println("entre numero de secu");
			s = scan.nextLine();
		}
		
		if(s.charAt(0) == 1) System.out.println("sexe : garcon");
		else System.out.println("sexe : fille");
		
		
		System.out.println("le departement est : "+departementSecu(s));
		
	}
}
