package sada3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\cisla1.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok =  "";
			int pocet = 0;
			while((riadok = vstup.readLine())!=null) {
				int cis = Integer.parseInt(riadok);
				if (prvocislo(cis)) {
					++pocet;
				}
			}
			
			vstup.close();
			System.out.println(pocet);
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

	private static boolean prvocislo(int cis) {
		if (cis == 1 || cis == 0) {
			return false;
		}
		for (int i = 2; i < cis ; i++) {
				if (cis % i == 0) {
					return false;
				}
			
		}
		return true;
	}

}
