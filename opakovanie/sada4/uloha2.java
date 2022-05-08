package sada4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\ziaci1.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			int por = 0;
			int m = 0;
			int n = 0;
			ArrayList<Integer>ch =  new ArrayList<>();
			ArrayList<Integer>d = new ArrayList<>();
			while((riadok = vstup.readLine()) != null) {
				int hod = Integer.parseInt(riadok);
				if (por == 0) {
					n = hod;
				}
				else if (por == 1) {
					m = hod;
				}
				else if(por < m + 2 ) {
					d.add(hod);
				}
				else {
					ch.add(hod);
				}
				
				por++;
			}
			vstup.close();
			int md = Collections.max(d);
			int mc = Collections.max(ch);
			if (md>mc) {
				System.out.println("Dievca je najvyssie");
			}
			else if(mc > md) {
				System.out.println("Chlapec je najvyssi");
				
			}
			else {
				System.out.println("Najvyssi chlapec a dievca su rovnako vysoke");
			}
			
			int sd = 0;
			int sc = 0;
			for (int i = 0; i < d.size(); i++) {
				sd += d.get(i);
			}
			for (int i = 0; i < ch.size(); i++) {
				sc += ch.get(i);
			}
			double dp = (double)sd/d.size();
			double dc = (double)sc/ch.size();
			double dz = (double)(sd+sc)/(d.size()+ch.size());
			DecimalFormat df = new DecimalFormat("0.00");
		
			System.out.println("Priemer dievcat " + df.format(dp));
			System.out.println("Priemer chlapcov " + df.format(dc));
			System.out.println("Priemer ziakov "+ df.format(dz));
			
		} catch (IOException e) {
			System.out.println("subor sa nenasiel");
		}
	}

}
