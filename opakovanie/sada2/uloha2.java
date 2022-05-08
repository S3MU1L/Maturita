package sada2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class uloha2 {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\zbierka.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			DecimalFormat df = new DecimalFormat("0.00");
			int pocet = 0;
			double suma = 0;
			int najviac = -1;
			while ((riadok = vstup.readLine())!=null) {
				pocet ++;
				int kolko = Integer.parseInt(riadok);
				suma += (double)kolko*0.5;
				if (kolko > najviac) {
					najviac = kolko;
				}
			}
			vstup.close();
			System.out.println("pocet volani :" + pocet);
			System.out.println("Vyzbierana suma : " + df.format(suma));
			double prisp = najviac*0.5;
			System.out.println("Najvacsi prispevok : "+ df.format(prisp));
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}
}
