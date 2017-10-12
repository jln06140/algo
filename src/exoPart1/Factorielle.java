package exoPart1;

import java.util.Scanner;

public class Factorielle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre pour obtenir factorielle");
		int n = scan.nextInt();
		
		System.out.println(facto(n));

	}
	
	public static int facto(int n) {
		
		if(n==1) return 1;
		return n * facto(n-1);
	}

}


