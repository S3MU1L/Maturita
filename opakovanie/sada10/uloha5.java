package sada10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class uloha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\vstup5.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			ArrayList<String>ch = new ArrayList<>();
			ArrayList<String>d = new ArrayList<>();
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				if (zena(data[0])) {
					d.add(riadok);
				}
				else {
					ch.add(riadok);
				}
			}
			vstup.close();
			System.out.println("dievcat : "+ d.size());
			for (int i = 0; i < d.size(); i++) {
				System.out.println(d.get(i));
				
			}
			System.out.println("chlapcov :" + ch.size());
			for (int i = 0; i < ch.size(); i++) {
				System.out.println(ch.get(i));
				
			}
		} catch (IOException e) {
			System.out.println("Subor sa nenasiel");
		}
	}

	private static boolean zena(String s) {
		String mesiac = s.substring(2,4);
		int cis = Integer.parseInt(mesiac);
		if (cis >= 51 && cis <= 62) {
			return true;
		}
		return false;
	}

}
