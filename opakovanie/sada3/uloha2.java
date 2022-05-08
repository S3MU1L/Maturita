package sada3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\cisla2.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			while ((riadok = vstup.readLine()) != null) {
				System.out.print(riadok+ " ");
				if (dvojkova(riadok)) {
					System.out.print("ANO"+ " ");
					int des = desiatkova(riadok);
					System.out.println(des);
				}
				else {
					System.out.println("NIE");
				}
			}
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

	private static int desiatkova(String s) {
		int akt_moc = 1;
		int sucet = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			int hod = (int)s.charAt(i)-'0';
			sucet  += akt_moc*hod;
			akt_moc*=2;
		}
		return sucet;
	}

	private static boolean dvojkova(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!='0' && s.charAt(i)!= '1') {
				return false;	
			}
			
		}
		return true;
	}

}
