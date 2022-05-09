package sada12;

import java.util.Scanner;

public class uloha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadavaj cislo vodica od 1 po 10 a jeho km, ukonci 0");
		int vstup = -1;
		int poradie;
		int pocty[] = new int[10]; 
		do {
			poradie = x.nextInt();
			vstup = x.nextInt();
			if (poradie != 0) {
				pocty[poradie-1]+=vstup;
			}
		} while (vstup != 0);
	
	for (int i = 0; i < pocty.length; i++) {
		System.out.println("Vodic "+(i+1)+ " : "+ pocty[i] );
		
	}	
	
	int min = pocty[0];
	int najmensie_por = -1;
	for (int i = 0; i < pocty.length; i++) {
		if (pocty[i] < min) {
			min = pocty[i];
			//poradie je od 1 takze pripocitam 1 ku indexu
			najmensie_por = i+1;
		}
		
	}
	System.out.println("Najemenej najazdil vodic s poradovym cislom " + najmensie_por);
	}

}
