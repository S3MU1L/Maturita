package sada11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class uloha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\jedla.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			int pocty[] = new int[3];
			// 0 = c, 1 = z, 2 = h
			String nazvy[] = {"cervena","zelena","hneda"};
			int kolko = 0;
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				kolko ++;
				if (data[1].equals("h")) {
					pocty[2]++;
				}
				else if(data[1].equals("c")) {
					pocty[0]++;
				}
				else {
					pocty[1]++;
				}
			}
			vstup.close();
			System.out.println("Pocet jedal na dalsi den :" + kolko);
			ArrayList<String>menej = new ArrayList<>();
			for (int i = 0; i < pocty.length; i++) {
				System.out.println(nazvy[i] + " : "+ pocty[i]);
				if (pocty[i]<20) {
					menej.add(nazvy[i]);
				}
			}
			System.out.println("Tie, ktore mali menej ako 20 :");
			for (int i = 0; i < menej.size(); i++) {
				System.out.print(menej.get(i)+ " ");
				
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
