package sada11;

import java.util.Scanner;

public class uloha3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj retazec");
		String s = x.nextLine();
		String over = s.toLowerCase();
		over = over.replaceAll(" ", "");
		if (palindrom(over)) {
			System.out.println("Je to palindrom");
		}
		else {
			String nove = "";
			for (int i = s.length()-1; i >= 0; i--) {
				nove += s.charAt(i);
				
			}
			System.out.println(nove);
		}
	}

	private static boolean palindrom(String over) {
		for (int i = 0; i <= over.length()/2; i++) {
			if (over.charAt(i) != over.charAt(over.length()-1-i)) {
				return false;
			}
			
		}
		return true;
	}
}
