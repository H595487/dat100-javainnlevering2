package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {

			for (int i : rad) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "";
		int i = 0;

		for (int x[] : matrise) {
			for (int y : x) {
				s = s + y + " ";
				i++;
				if (i % 3 == 0) {
					s = s + "\n";
				}
			}
		}

		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise.length];

		int g = 0;
		for (int x[] : matrise) {

			int h = 0;

			for (int y : x) {

				nyMatrise[g][h] = y * tall;
				h++;

			}
			g++;

		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean x = true;

		if (a.length == b.length) {
			for (int z[] : a) {
				int rad = 0;
				for (int y : z) {
					int sete = 0;
					if (a[rad][sete] != b[rad][sete]) {
						x = false;
					}
				}
			}
		} else {
			x = false;
		}

		return x;

		/*
		 * if (a.length == b.length) { for(int i = 0; i < a.length; i++) { for (int z =
		 * 0; z < a.length; z++) {
		 * 
		 * if(a[i][z] != b[i][z]) { x = false; } } } } else { x = false; }
		 */
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[matrise.length - 1].length];

		int tall2 = 0;

		for (int i[] : matrise) {
			int tall1 = 0;

			for (int x : i) {
				nyMatrise[tall1][tall2] = x;
				tall1++;
			}
			tall2++;

		}
		return nyMatrise;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int x = a.length;
		int y = a[x - 1].length;
		int z = b.length;

		int[][] c = new int[x][y];
		int tall = 0;

		if (y == z) {

			for (int i = 0; i < x; i++) {

				for (int h = 0; h < x; h++) {
					int tall1 = 0;

					for (int g = 0; g < x; g++) {

						tall1 = tall1 + a[tall][g] * b[g][h];
					}

					c[i][h] = tall1;
				}
				tall++;
			}
		}

		return c;

	}
}
