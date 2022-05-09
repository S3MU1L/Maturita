package sada10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class uloha8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\vstup8.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			double tab[][] = new double[100][12];
			//potrebujeme 2d pole, v riadkoch budu roky a  v stlpcoch mesiace 
			//ked to bole inicializujem takto, tak tam su defaultne nuly.
			// budeme ratat v intervale 100 rokov, mohli by sme mat aj vacsie pole, ale naco xD
			// cize napr 2004 : km_v_jan, km_v_feb
			// 			 2005 : km_v_jan ...
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				Double kolko = Double.parseDouble(data[1]);
				String rok = data[0].substring(0,2);
				int r = Integer.parseInt(rok);
				if (r<=22) {
					r += 2000;
				}
				else {
					r += 1900;
				}
				String mes = data[0].substring(2,4);
				int m =Integer.parseInt(mes);
				//rok 1923 bude na indexe 0
				// takze nas rok bude na rok-1923 indexe
				//odcitam 1 od mesiaca, lebo ich pocitam od 1, ale v poli su od 0
				tab[r - 1923][m-1] += kolko;
				//do roku a daneho mesiaca pripocitam km prejdene
			
			}
			vstup.close();
			String mesiace[] = {"januar", "februar", "marec", "april", "maj", "jun", "jul", "august", "september", "oktober", "november", "december"};
			for (int i = 0; i < 100; i++) {
					for (int j = 0; j < 12; j++) {
						if (tab[i][j] != 0) {
							int kol = i + 1923;
							System.out.println(mesiace[j] +" "+ kol +" : "+ tab[i][j] + " km");
						}
						
					}
				
			}
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

}
