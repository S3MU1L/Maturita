package sada9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\cisla.txt");
			BufferedReader vstup = new BufferedReader(f);
			ArrayList<Double>cisla = new ArrayList<>();
			String riadok = "";
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				for (int i = 0; i < data.length; i++) {
					cisla.add(Double.parseDouble(data[i]));	
				}
			}
			vstup.close();
			double m = Collections.max(cisla);
			ArrayList<Double>cisla_bez_max = new ArrayList<>();
			for (int i = 0; i < cisla.size(); i++) {
				if (cisla.get(i)!=m) {
					cisla_bez_max.add(cisla.get(i));
				}
				
			}
			double druh_max = Collections.max(cisla_bez_max);
			System.out.println("Druhe najvacsie cislo v poli je :" + druh_max);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
