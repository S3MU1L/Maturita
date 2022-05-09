package sada11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\znamky.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			int pocet = 0;
			int kolko = 0;
			int suma = 0;
			int pocty[] = new int[5];
			while((riadok = vstup.readLine())!=null) {
				if (pocet == 0) {
					kolko  = Integer.parseInt(riadok);
				}
				else {
					String data[] = riadok.split(" ");
					for (int i = 0; i < data.length; i++) {
						suma += Integer.parseInt(data[i]);
						pocty[Integer.parseInt(data[i])-1]++;
					}
				}
				pocet++;
			}
			vstup.close();
			for (int i = 0; i < pocty.length; i++) {
				System.out.println("Pocet "+(i + 1) +" : "+pocty[i] );
			}
			double priemer = (double)suma/kolko;
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Priemer znamka : " +df.format(priemer));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Subor sa nenasiel");
		}
	}

}
