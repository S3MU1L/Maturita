package sada4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\vykop.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			ArrayList<Integer>hlbky = new ArrayList<>();
			while((riadok = vstup.readLine())!= null) {
				System.out.println(riadok);
				int h = Integer.parseInt(riadok);
				hlbky.add(h);
				
			}
			System.out.println("Pozicie, kde treba najviac zeminy");
			int naj = Collections.max(hlbky);
			for (int i = 0; i < hlbky.size(); i++) {
				if (hlbky.get(i) == naj) {
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
			int zac = 0;
			int dlzka = 1;
			int akt_dlzka = 1;
			for (int i = 0; i < hlbky.size()-1; i++) {
				if (hlbky.get(i+1)>=hlbky.get(i)) {
					akt_dlzka += 1;
					if (akt_dlzka > dlzka) {
						dlzka = akt_dlzka;
						zac = i - dlzka + 2;
					}
				}
				else {
					akt_dlzka = 1;
				}
				
			}
			System.out.println("Najdlhsia neklesajuca postupnost : ");
			System.out.println(dlzka);
			for (int i = 0; i < dlzka ; i++) {
				System.out.print(hlbky.get(zac + i)+ " ");
				
			}
			
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

}
