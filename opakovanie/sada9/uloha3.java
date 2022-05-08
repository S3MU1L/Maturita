package sada9;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Zadaj retazec");
			FileWriter f = new FileWriter("C:\\Users\\PC\\Downloads\\statistika.txt");
			BufferedWriter vystup = new BufferedWriter(f);
			Scanner x = new Scanner(System.in);
			String inp = x.nextLine();
			//dam to rovno na male znaky.
			inp = inp.toLowerCase();
			int pocty[] = new int[26];
			for (int i = 0; i < inp.length(); i++) {
				//vlastna metoda na checknutie, ci je character pismeno
				if (znak(inp.charAt(i))) {
					int index = (int)inp.charAt(i)-97;
					pocty[index]++;
				}
				
			}
			for (int i = 0; i < pocty.length; i++) {
				System.out.println(pocty[i]);
				if (pocty[i]!=0) {
					char c = (char)(i+97);
					f.write(c + " " + pocty[i]);
					f.write("\n");
				}
				
			}
			vystup.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	private static boolean znak(char c) {
	
		return Character.isAlphabetic(c);
	}

}
