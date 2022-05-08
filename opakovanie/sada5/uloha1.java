package sada5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\pocitac.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			int pocet = 0;
			ArrayList<String>poc = new ArrayList<>();
			ArrayList<Integer>disk = new ArrayList<>();
			ArrayList<Integer>ram = new ArrayList<>();
			ArrayList<Double>fre = new ArrayList<>();
			ArrayList<Integer>port = new ArrayList<>();
			while((riadok = vstup.readLine())!=null) {
				if (pocet % 2 == 0) {
					poc.add(riadok);
				}
				else {
					String data[] = riadok.split(" ");
					disk.add(Integer.parseInt(data[0]));
					ram.add(Integer.parseInt(data[1]));
					fre.add(Double.parseDouble(data[2]));
					port.add(Integer.parseInt(data[3]));
				}

				pocet++;
			}
			vstup.close();
			int najd = Collections.max(disk);
			int najram = Collections.max(ram);
			double najfre = Collections.max(fre);
			int najpor = Collections.max(port);
			String najlepsi = poc.get(0);
			int najviac = -1;
			for (int i = 0; i < poc.size(); i++) {
				int akt = 0;
				if (disk.get(i) == najd) {
					akt ++;
				}
				if (ram.get(i) == najram) {
					akt ++;
				}
				if (fre.get(i) == najfre) {
					akt ++;
				}
				if (port.get(i) == najpor) {
					akt ++;
				}
				if (akt > najviac) {
					najviac = akt;
					najlepsi = poc.get(i);
				}
				
			}	
			System.out.println("Najlepsi pocitac je : "+ najlepsi);
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

}
