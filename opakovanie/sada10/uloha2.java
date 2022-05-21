package sada10;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class lopticka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		double h = x.nextDouble();
		double k = x.nextDouble();
		int nad = 0;
		ArrayList<Double>vysky = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("0.00");
		for (int i = 0; i < 11; i++) {
			vysky.add(h);
			if (h >= 1 && i != 0) {
				++nad;
			}
			h *= k;
		}
		System.out.println(nad);
		for (int i = 0; i < vysky.size(); i++) {
			String jednotka = "m";
			double c = vysky.get(i);
			if (c < 1) {
				 c*= 100;
				 jednotka = "cm";
			}
			System.out.println(i+": " + df.format(c)+" "+ jednotka);
		}
	}

}
