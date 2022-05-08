package sada3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class uloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\cisla3.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				for (int i = 0; i < data.length; i++) {
					riadok = data[i];
					System.out.print(riadok + " ");
					int cifsuc = suc(riadok);
					System.out.println(cifsuc);
				}
				
			}
			vstup.close();
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

	private static int suc(String s) {
		int suc = 0;
		for (int i = 0; i < s.length(); i++) {
				int kolko = s.charAt(i) - '0';
				suc += kolko;
		}
		return suc;
	}

}
