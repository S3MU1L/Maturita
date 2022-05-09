package sada12;

import java.util.Scanner;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 600;
		Scanner x = new Scanner(System.in);
		int kolko = -1;
		int vytahy = 1;
		do {
			kolko = x.nextInt();
			if (kolko>600) {
				System.out.println("Clovek je taky tazky, ze sa nezmesti do vytahu, zadaj mensiu hmotnost");
			}
			else {
				if (limit - kolko <0) {
					System.out.println("Novy vytah");
					vytahy ++;
					limit = 600;
				}
				limit -= kolko;
				System.out.println("Kolko sa este zmesti do vytahu: "+ limit);
			}
		} while (kolko != 0);
		
		System.out.println("Potrebujeme "+ vytahy + " vytahy");
	}

}
