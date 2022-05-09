package sada10;

import java.util.ArrayList;
import java.util.Scanner;

public class uloha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		String s = x.nextLine();
		String slova[] = s.split(" ");
		ArrayList<String>nove = new ArrayList<>();
		for (int i = 0; i < slova.length; i++) {
			String akt = slova[i];
			nove.add(premiesaj(akt));
			
		}
		for (int i = 0; i < nove.size(); i++) {
			System.out.print(nove.get(i) + " ");
			
		}
	
	}

	private static String premiesaj(String akt) {
		String vysledok = "";
		//prve pismeno musi ostat, ostatne prehadzem
		vysledok += akt.charAt(0);
		for (int i = 1; i <= akt.length()-1; i+=2) {
			if (i + 1 < akt.length()) {
				vysledok += akt.charAt(i+1);
			}
			vysledok += akt.charAt(i);
		}
		return vysledok;
	}

}
