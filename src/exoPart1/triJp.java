package exoPart1;

public class triJp {

	public static void genereDiff(int tab[]) {
		int x = (int)(Math.random() * 6+1);
		tab[0] = x;
		int cpt =1;
		boolean sortir = false;
		
		while(sortir == false) 
		{
			tab[cpt] = (int)(Math.random() * 6+1);
			for(int i=0;i<cpt;i++) {
				if(tab[cpt] == tab[i]){
					tab[cpt] = (int)(Math.random() * 6 +1);
					i=0;
				}
			}
			
			if (cpt == tab.length-1) sortir = true;
			cpt++;
		}	
	}
		
	
	public static void affichage(int tab[]) {
		for(int i = 0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	public static void main(String[] args) {
		int tab [] = new int[6];
		genereDiff(tab);
		affichage(tab);

	}

}
