package opakovanie;

import java.util.Scanner;

public class meno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj svoje krstne meno");
		String meno = x.next();
		System.out.println(meno);
		System.out.println("Tvoje krstne meno je dlhe : "+  meno.length());
		int s = 0;
		String sam = "aeiou";
		for (int i = 0; i < meno.length(); i++) {
			if (obsahuje(sam, meno.charAt(i))) {
				s++;
			}
			
		}
		System.out.println("Tvoje meno obsahuje : " +s+" samohlasok" );
		System.out.println("Zadaj pocet opakovani: ");
		int n = x.nextInt();
		String medzera = "";
		for (int i = 0; i < n; i++) {
			System.out.println(medzera+meno);
			medzera += " ";
			
		}
	}

	private static boolean obsahuje(String sam, char c) {
		for (int i = 0; i < sam.length(); i++) {
			if (sam.charAt(i) == c) {
				return true;
			}
			
		}
		return false;
	}

}
