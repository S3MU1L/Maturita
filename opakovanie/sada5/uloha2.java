package sada5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\siet.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			//leakol som si ip, ups
			int myip[] = {192,168,1,16};
			while ((riadok = vstup.readLine())!= null) {
				String data[] = riadok.split(" ");
				int kolko = Integer.parseInt(data[4]);
				for (int i = 0; i <= 3; i++) {
					int hodnota = Integer.parseInt(data[i]);
					String vysledok = sprav_bin(hodnota);
					String moj = sprav_bin(myip[i]);
					System.out.println(vysledok);
					System.out.println(moj);
					for (int j = 0; j < vysledok.length(); j++) {
						int c1 = (int)vysledok.charAt(j)-'0';
						int c2 = (int)moj.charAt(j)-'0';
						System.out.println(c1 + " "+ c2);
						if (c1 != c2) {
							kolko--;
						}
						
					}
					
				}
				System.out.println(kolko);
				if (kolko >= 0) {
					System.out.println("ANO patri do danej siete");
				}
				else {
					System.out.println("Nepatri do danej siete");
				}
			}
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

	private static String sprav_bin(int hodnota) {
		String b = Integer.toBinaryString(hodnota);
		int doplnok = 8-b.length();
		String vysledok = "";
		for (int j = 0; j < doplnok; j++) {
			vysledok += "0";
		}
		vysledok +=  b;
		return vysledok;
	}

}
