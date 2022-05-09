package sada12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class uloha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cakanie, vzdialenost, zase cakanie ?m zasa vzdialenost;
		int nacakane = 0;
		double kms = 0;
		double kmt = 0;
		int pocet_startov = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\taxikar.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				nacakane += (Integer.parseInt(data[1])+ Integer.parseInt(data[3]));
				if (data[0].equals("T")) {
					kmt += (Double.parseDouble(data[2]) + Double.parseDouble(data[4]));
				}
				else {
					pocet_startov ++;
					kms += (Double.parseDouble(data[2]) + Double.parseDouble(data[4]));
				}
			}
			vstup.close();
			System.out.println("Celkovy cas cakania v sekundach" + nacakane);
			System.out.println("Celkova vzdialenost "+ (kms + kmt));
			int minuty =  nacakane / 60;
			double celkova = 	pocet_startov + 0.5 * kms + 0.35 * kmt + 0.1 * nacakane;
			System.out.println("Celkovo zaplatene "+ df.format(celkova)+ " eur");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
