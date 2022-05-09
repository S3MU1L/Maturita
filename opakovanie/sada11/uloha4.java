package sada11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class uloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\mapa.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			ArrayList<Integer>h = new ArrayList<>();
			int hory = 0;
			int more = 0;
			int niz = 0;
			int kolko = 0;
			while((riadok = vstup.readLine())!=null) {
				h.add(Integer.parseInt(riadok));
				System.out.println(riadok);
				++kolko;
				if (Integer.parseInt(riadok)==0) {
					++more;
				}
				else if(Integer.parseInt(riadok)<=300) {
					++niz;
				}
				else {
					++hory;
				}
			}
			int min = Collections.min(h);
			int max = Collections.max(h);
			System.out.println("Najmensia vyska: " + min );
			int f1 = Collections.frequency(h, min);
			System.out.println("Pocet vyskytov: "+ f1);
			int f2 = Collections.frequency(h, max);
			System.out.println("Najvacsia vyska: " + max);
			System.out.println("Pocet vyskytov: "+ f2);
			DecimalFormat df = new DecimalFormat("0.00");
			double ph = (double)100*hory/kolko;
			double pm = (double)100*more/kolko;
			double pn = (double)100*niz/kolko;
			System.out.println("Percentualne zastupenie mori : "+ df.format(pm));
			System.out.println("Percentualne zastupenie nizin : "+ df.format(pn));
			System.out.println("Percentualne zastupenie hor : "+ df.format(ph));
		} catch (IOException e) {
			
		}
	}

}
