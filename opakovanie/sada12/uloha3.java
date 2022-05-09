package sada12;

import java.util.Scanner;

public class uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj cislo");
		int n = x.nextInt();
		if (dokonale(n)) {
			System.out.println("Cislo je dokonale");
		}
		else {
			System.out.println("Nie je dokonale");
		}
		System.out.println("Po kade chces hladat dokonale cisla :");
		int k = x.nextInt();
		for (int i = 1; i <= k; i++) {
			if (dokonale(i)) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.println("Prve trojciferne dokonale cislo");
		for (int i = 100; i <= 999; i++) {
			if (dokonale(i)) {
				System.out.println(i);
				break;
			}
			
		}
	}

	private static boolean dokonale(int n) {
		int sucet_del = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sucet_del += i;
				
			}
			
		}
		return  (n == sucet_del);
		
	}

}
