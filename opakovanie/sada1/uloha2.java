package sada1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		ArrayList<String>mena = new ArrayList<>();
		ArrayList<Integer>hodiny = new ArrayList<>();
		ArrayList<Integer>mzdy = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Zadaj meno");
			String meno = x.next();
			System.out.println("Zadaj odpracovane hodiny");
			int h = x.nextInt();
			System.out.println("Zadaj hodinovu mzdu");
			int mzda = x.nextInt();
			mena.add(meno);
			hodiny.add(h);
			mzdy.add(mzda);
		}
		int suma = 0;
		for (int i = 0; i < n; i++) {
			int hruba = mzdy.get(i) * hodiny.get(i);
			double cista = (double)hruba * (1-0.19);
			suma += hruba;
			double dan = (double)hruba - cista;
			System.out.println(mena.get(i)+ " "+ hodiny.get(i)+ " "+ mzdy.get(i)+ " "+ hruba + " "+ df.format(cista) + " "+ df.format(dan));
			
		}
	
	System.out.println("Celkova suma na vyplatenie zamestnancov : " + suma);
	}
	
	

}
