package sada11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class uloha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		ArrayList<Integer>vysky = new ArrayList<>();
		int vstup = -1;
		do {
			System.out.println("Zadaj vysku");
			vstup = x.nextInt();
			vysky.add(vstup);
		} while (vstup != 0);
		for (int i = 0; i < vysky.size()-1; i++) {
			System.out.print(vysky.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Pocet hercov : " +(vysky.size()-1));
		int max = Collections.max(vysky);
		System.out.println("Najvyssi " + max);
		
	}

}
