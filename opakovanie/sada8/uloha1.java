package sada8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\TANCE.txt");
			BufferedReader vstup = new BufferedReader(f);
			FileWriter standart = new FileWriter("C:\\Users\\PC\\Downloads\\STANDARD.txt");
			BufferedWriter stanvys = new BufferedWriter(standart);
			FileWriter latin = new FileWriter("C:\\Users\\PC\\Downloads\\LATINO.txt");
			BufferedWriter latinvys = new BufferedWriter(latin);
			int sk = 0;
			int cz = 0;
			ArrayList<Integer>bodylat = new ArrayList<>();
			ArrayList<Integer>bodysta = new ArrayList<>();
			ArrayList<String>krajinylat = new ArrayList<>();
			ArrayList<String>krajinysta = new ArrayList<>();
			ArrayList<String>kodylat = new ArrayList<>();
			ArrayList<String>kodysta = new ArrayList<>();
			String riadok = "";
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				if (data[1].equals("LAT")) {
					latin.write(riadok);
					latin.write("\n");
					bodylat.add(Integer.parseInt(data[3]));
					krajinylat.add(data[2]);
					kodylat.add(data[0]);
					
				}
				else {
					standart.write(riadok);
					standart.write("\n");
					bodysta.add(Integer.parseInt(data[3]));
					krajinysta.add(data[2]);
					kodysta.add(data[0]);
				}
				if (data[2].equals("CZ")) {
					cz += Integer.parseInt(data[3]);
				}
				else {
					sk += Integer.parseInt(data[3]);
				}
				
				
			}
			vstup.close();
			stanvys.close();
			latinvys.close();
			if (cz>sk) {
				System.out.println("cesko uspesnejsie");
			}
			else if(cz < sk) {
				System.out.println("slovensko uspesnejsie");
			}
			else {
				System.out.println("Mali rovnako bodov");
			}
			int najlat = Collections.max(bodylat);
			int najsta = Collections.max(bodysta);
			for (int i = 0; i < bodylat.size(); i++) {
				if (bodylat.get(i) == najlat) {
					System.out.println("Najlepsi latinsky par: "+kodylat.get(i) + " "+ krajinylat.get(i) );
					break;
				}
				
			}
			
			for (int i = 0; i < bodysta.size(); i++) {
				if (bodysta.get(i) == najlat) {
					System.out.println("Najlepsi standardny par: "+kodysta.get(i) + " "+ krajinysta.get(i) );
					break;
				}
				
			}
			
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

}
