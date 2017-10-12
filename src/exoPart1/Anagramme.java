package exoPart1;



public class Anagramme {

	public static void main(String[] args) {
		// Objectif : calculer toutes les permutations entre abcd
		permutation("", "abcd", 0);
	}
	
	public static void permutation(String prefix, String reste, int profondeur)
	{
		// Cette fonction permet de cr�er toute les permutation restantes sur la partie reste
		if(reste.length() == 0)
		{
			// Reste est vide => nous avons donc une permutation compl�te � afficher
			System.out.println(prefix);
		}
		else
		{
			// Boucle sur les caract�re de la partie reste
			for(int i=0 ; i<reste.length() ; i++)
			{
				// La chaine affichage permet de faire un affichage avec une incr�mentation quand on est dans une fonction permutation
				// appel�e par une autre fonction permutation
				String affichage = "";
				for(int j = 0 ; j<profondeur ; j++)
					affichage = affichage + "     ";
				
				// Afficher la chaine affichage qui montre dans la console les arguments de l'appel r�cursif
				affichage = affichage + "Appeler permutation avec " + prefix + reste.charAt(i) + " & " + reste.substring(0, i) + reste.substring(i+1, reste.length());
				System.out.println(affichage);
				
				// Appel r�cursif
				// on ajoute au prefix courant le caract�re sur lequel on travail => nouvelle valeur de prefix pour les sous appels
				// on enleve � reste le caract�re sur lequel on travail => nouvelle valeur de reste pour les sous appels suivants
				// profondeur est incr�ment� car on est � une r�cursion plus profonde
				permutation(prefix + reste.charAt(i), reste.substring(0, i) + reste.substring(i+1, reste.length()), profondeur +1);
			}
		}
	}
}