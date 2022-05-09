package sada10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class uloha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\vstup7.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			int pocet = 0;
			ArrayList<Integer>sek = new ArrayList<>();
			while((riadok = vstup.readLine())!=null) {
				sek.add(Integer.parseInt(riadok));
			}
			vstup.close();
			System.out.println("Pocet zaznamov : 5");
			for (int i = 0; i < sek.size(); i++) {
				int akt = sek.get(i);
				premen(akt);
				
			}
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

	private static void premen(int akt) {
		int hod = akt / 3600;
		akt %= 3600;
		int min = akt/60;
		akt %= 60;
		int sek = akt;
		String h = Integer.toString(hod);
		String m = Integer.toString(min);
		if (min == 0) {
			m = "0";
		}
		String s = Integer.toString(sek);
		if (sek == 0) {
			s = "0";
		}
		String predmin = "";
		String predsek = "";
		if (min <= 9) {
			predmin = "0";
		}
		if (sek <= 9) {
			predsek = "0";
		}
		if (hod != 0) {
			System.out.println(h + ":"+predmin+m+":"+predsek+s);
		}
		else if (min != 0) {
			System.out.println("   "+m+":"+predsek+s);
		}
		else {
			System.out.println("     "+s);
		}
		
	}

}
