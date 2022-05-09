package sada12;

import java.util.Scanner;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj suradnice trojuholnika");
		double a1,a2,b1,b2,c1,c2;
		a1 = x.nextDouble();
		a2 = x.nextDouble();
		b1 = x.nextDouble();
		b2 = x.nextDouble();
		c1 = x.nextDouble();
		c2 = x.nextDouble();
		double d1 = vzd(a1,a2,b1,b2);
		double d2 = vzd(a1,a2,c1,c2);
		double d3 = vzd(b1,b2,c1,c2);
		if (trojuholnik(d1,d2,d3)) {
			System.out.println("Ano je to trojuholnik");
			double o = d1 + d2 + d3;
			System.out.println("Obvod je : "+ o);
		}
		else {
			System.out.println("Nie je to trojuholnik");
		}
	}

	private static boolean trojuholnik(double d1, double d2, double d3) {
		return ((d1 + d2 > d3) && (d1 + d3 > d2) && (d2 + d3 > d1));
			
		
	}

	private static double vzd(double a1, double a2, double b1, double b2) {
			return Math.sqrt((b1 - a1) * (b1 - a1) +  (b2 - a2) * (b2 - a2));
	}

}
