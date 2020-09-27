package no.hvl.dat100.lab5.tabeller;

public class G {

	public static void main(String[] args) {
		int[] tabell = {1, 8, 3, 7 };
		int i=1;
		boolean sortert = true;
		while (sortert && i<tabell.length) {
			if(tabell[i-1] <=tabell[i])
				i++;
			else
				sortert=false;
		}
		System.out.print(sortert);

	}

}
