package sada1;

import java.util.Scanner;

public class uloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int a = -1;
		int b = 0;
		do {
			System.out.println("Zadaj zaciatok");
			a = x.nextInt();
			System.out.println("Zadaj koniec");
			b = x.nextInt();
			for (int i = a; i <= b; i++) {
				if (prvocislo(i)) {
					System.out.print(i+ " ");
				}
				
			}
			System.out.println();
			
		} while (a != b);
	}

	private static boolean prvocislo(int x) {
		if (x == 1 || x == 0) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
			
		}
		return true;
	}

}
