package sada10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj vysku a k oddelene ciarkou:");
		double h = x.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		double k = x.nextDouble();
		//n je pocet krat, kolko lopta skoci nad 1m.
		
		// uvedomim si, ze h *k^n >=1
		// kde k^n nie je xor ale k na ntu;
		// dam limitny pripad : h * k^n = 1
		//predelim h
		// zlogaritmujem
		//dostavam --> log o zaklade k z (1/h) = n
		//kedze v programovani nemame logaritmy o 'cudnych zakladoch', musime si vystacit so vzorcom
		// ze logn(k) = log10(k)/log10(n), nemusi byt zaklad 10, moze byt hociaky iny, len musia byt rovnake 
		int n = (int) (Math.log10(1/h)/Math.log10(k));
		System.out.println(n);
		for (int i = 0; i <=10; i++) {
			if (h >= 1) {
				System.out.println(i+": "+df.format(h) + "m");
			}
			else {
				
				
				System.out.println(i+": "+df.format(100*h)+ " cm");
			}
			h *= k;
			
		}
	}

}
