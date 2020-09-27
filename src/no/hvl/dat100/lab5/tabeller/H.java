package no.hvl.dat100.lab5.tabeller;

public class H {

	public static void main(String[] args) {
		int[] tabell1 = {1, 8, 3, 7 };
		int[] tabell2 = {2, 4};
		
		int nyLengde = tabell1.length + tabell2.length;
		int[]nyTabell = new int[nyLengde];
		for (int i = 0; i<tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int j = 0; j<tabell2.length; j++) {
			nyTabell[tabell1.length+j] = tabell2[j];
			
		}
		for (int k = 0; k < nyTabell.length; k++) {
			System.out.println(nyTabell[k]);
		}

	}

}
