package exoPart1;



public class Anagramme {

	public static void main(String[] args) {
		// Objectif : calculer toutes les permutations entre abcd
		permutation("", "abcd", 0);
	}
	
	public static void permutation(String prefix, String reste, int profondeur)
	{
		// Cette fonction permet de créer toute les permutation restantes sur la partie reste
		if(reste.length() == 0)
		{
			// Reste est vide => nous avons donc une permutation complète à afficher
			System.out.println(prefix);
		}
		else
		{
			// Boucle sur les caractère de la partie reste
			for(int i=0 ; i<reste.length() ; i++)
			{
				// La chaine affichage permet de faire un affichage avec une incrémentation quand on est dans une fonction permutation
				// appelée par une autre fonction permutation
				String affichage = "";
				for(int j = 0 ; j<profondeur ; j++)
					affichage = affichage + "     ";
				
				// Afficher la chaine affichage qui montre dans la console les arguments de l'appel récursif
				affichage = affichage + "Appeler permutation avec " + prefix + reste.charAt(i) + " & " + reste.substring(0, i) + reste.substring(i+1, reste.length());
				System.out.println(affichage);
				
				// Appel récursif
				// on ajoute au prefix courant le caractère sur lequel on travail => nouvelle valeur de prefix pour les sous appels
				// on enleve à reste le caractère sur lequel on travail => nouvelle valeur de reste pour les sous appels suivants
				// profondeur est incrémenté car on est à une récursion plus profonde
				permutation(prefix + reste.charAt(i), reste.substring(0, i) + reste.substring(i+1, reste.length()), profondeur +1);
			}
		}
	}
}