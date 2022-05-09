package sada11;

import java.util.Scanner;


public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj  svoje meno");
		String meno = x.nextLine();
		System.out.println("Tvoje meno je "+ meno);
		System.out.println("Tvoje meno je dlhe " +meno.length()+" znakov");
		String samohlasky  = "aeiou";
		int pocsam = 0;
		String malemeno = meno.toLowerCase();
		for (int i = 0; i < malemeno.length(); i++) {
			if (samohlaska(malemeno.charAt(i),samohlasky)) {
				++pocsam;
			}
			
		}
		System.out.println("Tvoje meno ma : "+pocsam + " samohlasok");
		System.out.println("Zadaj pocet opakovani :");
		int k = x.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.print(meno);
			System.out.print("\n");
			for (int j = 0; j < (i+1)*meno.length(); j++) {
				System.out.print(" ");
				
			}
			System.out.print(" ");
			
		}
	}

	private static boolean samohlaska(char c, String samohlasky) {
		for (int i = 0; i < samohlasky.length(); i++) {
			if (c == samohlasky.charAt(i)) {
				return true;
			}
			
		}
		return false;
	}


}
