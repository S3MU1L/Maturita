package sada11;

import java.util.Scanner;



public class uloha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Kolkokrat chces opakovat ?");
		int n = x.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Zadaj 2 cisla");
			int a = x.nextInt();
			int b = x.nextInt();
			int gcd = euklid(a,b);
			a /= gcd;
			b /= gcd;
			System.out.println(a + "/" + b);
		}
	}

	private static int euklid(int a, int b) {
		while(a!=b) {
			if (a > b) {
				a -= b;
			}
			else {
				b -= a;
			}
		}
		return a;
	}

}
