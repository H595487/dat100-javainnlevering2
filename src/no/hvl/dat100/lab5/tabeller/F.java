package no.hvl.dat100.lab5.tabeller;

public class F {

	public static void main(String[] args) {
		int[] tabell = {1, 2, 3, 7 };
		
				
		int sistePos = tabell.length - 1;
	    
	    for (int i=0; i <= sistePos/2; i++) {
	      int hjelp = tabell[i];
	      tabell[i] = tabell[sistePos-i];
	      tabell[sistePos-i] = hjelp;
	     System.out.print(tabell[i]);
	    }
	   
	  }
}	 
		
		
		
		
		
		
	
