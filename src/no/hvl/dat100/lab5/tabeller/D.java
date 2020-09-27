package no.hvl.dat100.lab5.tabeller;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class D {

	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3 };
		
		int leterEtter = parseInt(showInputDialog("Tall:"));

		
		boolean funnet = false;
		int i = 0;
		while (!funnet && i<tabell.length) {
			if (tabell[i] == leterEtter)
				funnet = true;
			else
				i++;
		}
		System.out.print(funnet);

	}

}
