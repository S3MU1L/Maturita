package sada12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class uloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\trasy.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			DecimalFormat df = new DecimalFormat("0.00");
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				double trasa = 0;
				for (int i = 3; i < data.length-1; i+=2) {
					trasa += dlzka(Integer.parseInt(data[i-3]),Integer.parseInt(data[i-2]),Integer.parseInt(data[i-1]),Integer.parseInt(data[i]));
				}
				
				System.out.println("Dlzka trasy " + df.format(trasa));
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	private static double dlzka(int a1, int a2, int b1, int b2) {
		return Math.sqrt((b1 - a1) * (b1 - a1)  + (b2 - a2) * (b2 - a2));
	}


}
