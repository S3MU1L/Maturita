package sada3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class uloha3 {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\text.txt");
			BufferedReader vstup = new BufferedReader(f);
			FileWriter w = new FileWriter("C:\\Users\\PC\\Downloads\\otoc.txt");
			BufferedWriter vystup = new BufferedWriter(w);
			String riadok = "";
			while((riadok = vstup.readLine())!=null) {
				String otoceny = otoc(riadok);
				w.write(otoceny);
				w.write("\n");
			}
			vstup.close();
			vystup.close();
		} catch (IOException e) {
			System.out.println("subor sa nenasiel");
		}
	}

	private static String otoc(String s) {
		String s2 = "";
		for (int i = s.length()-1; i >= 0; i--) {
				s2 += s.charAt(i);
		}
		return s2;
	}
}
