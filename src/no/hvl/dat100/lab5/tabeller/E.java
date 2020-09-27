package no.hvl.dat100.lab5.tabeller;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class E {

	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3 };
		int i = 0;
		int x = -1;
		int leterEtter = parseInt(showInputDialog("Tall:"));
		boolean funnet = false;
		
		while (!funnet && i<tabell.length) {
			if (tabell[i] == leterEtter)
				funnet = true;
			else
				i++;
		}
		if (funnet == true)
			System.out.print(i);
		else
			System.out.print(x);

}
}
