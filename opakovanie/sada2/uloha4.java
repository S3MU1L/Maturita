package sada2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class uloha4 {

	private static String typ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj typ pocasia");
		typ = x.next();
		DecimalFormat df = new DecimalFormat("0.00");
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\meteo.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
		
			ArrayList<String>stanice = new ArrayList<>();
			ArrayList<Double>teploty = new ArrayList<>();
			int pocet = 0;
			while ((riadok = vstup.readLine()) != null) {
				String data[] = riadok.split(" ");
				teploty.add(Double.parseDouble(data[2]));
				stanice.add(data[0]);
				if (data[3].equals(typ)) {
					pocet ++;
				}
			}
			vstup.close();
			double najt = Collections.max(teploty);
			double najm = Collections.min(teploty);
			String najtkod = "";
			String najmkod = "";
			for (int i = 0; i < teploty.size(); i++) {
				if (teploty.get(i) == najt) {
					najtkod = stanice.get(i);
				}
				if (teploty.get(i)== najm) {
					najmkod = stanice.get(i);
				}
				
			}
			System.out.println("Najmensia teplota "+ df.format(najm));
			System.out.println("Najvacsia teplota "+ df.format(najt));
			System.out.println("Kod najvacsej teploty :" + najtkod);
			System.out.println("Kod najmensej teploty :" + najmkod);
			System.out.println("Pocet stanic so zadanou oblacnostou :" + pocet);
			
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}	
	}

}
