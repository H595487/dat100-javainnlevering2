package no.hvl.dat100.lab5.tabeller;

public class B {

	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3 };
		String utskrift = "";
		for (int i = 0; i < tabell.length; i++) {
			if (i!= tabell.length-1) {
				utskrift = utskrift + tabell[i] + ",";
			}
			else {
				utskrift = utskrift + tabell[i] ;
			}
			

		}
		String returstring = "[" + (utskrift) + "]";
		System.out.print(returstring);
	}

}
