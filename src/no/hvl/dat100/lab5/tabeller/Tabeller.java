package no.hvl.dat100.lab5.tabeller;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String utskrift = "";
		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length - 1) {
				utskrift = utskrift + tabell[i] + ",";
			} else {
				utskrift = utskrift + tabell[i];
			}

		}
		return "[" + utskrift + "]";
	}

	// c)
	public static int summer(int[] tabell) {

		// for-løkke:
		
		 int sum = 0;
		 
		  for (int i = 0; i < tabell.length; i++) { 
		  sum += (tabell[i]); 
		  } 
		  
		 return sum;
		 

		/* While-løkke:

		int sum = 0;
		int i = 0;

		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
*/
		/*
		 * Utvidet for-løkke:
		 * 
		 * int sluttSum=0; int i = 0;
		 * 
		 * for (int sum: tabell) sluttSum +=sum;
		 * 
		 * return sluttSum;
		 */

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall)
				funnet = true;
			else
				i++;
			}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		int x = -1;
		
		boolean funnet = false;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall)
				funnet = true;
			else
				i++;
		}
		if (funnet == true)
			return (i);
		else
			return (x);

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int nyLengde = tabell.length;
		int [] nyTabell = new int [nyLengde];
	    
	    for (int i=0; i < tabell.length; i++) {
	      nyTabell[i] = tabell[i];
	    }
	      int pos = nyTabell.length-1;
	      
	      for(int x = 0; x<=pos; x++) {
	    	  int tmp = nyTabell[pos];
	    	  nyTabell[pos] = nyTabell[x];
	    			  nyTabell[x] = tmp;
	    	  pos--;
	      
	    }
	    return nyTabell;
	    
	  }
	

	// g)
	public static boolean erSortert(int[] tabell) {

		int i=1;
		boolean sortert = true;
		while (sortert && i<tabell.length) {
			if(tabell[i-1] <=tabell[i])
				i++;
			else
				sortert=false;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[]nyTabell = new int[nyLengde];
		for (int i = 0; i<tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int j = 0; j<tabell2.length; j++) {
			nyTabell[tabell1.length+j] = tabell2[j];
			
		}
		for (int k = 0; k < nyTabell.length; k++) {
			
		}
		return nyTabell;

	}
}
