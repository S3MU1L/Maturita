package sada2;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vo for cykle sa vypisuju aktualna dlzka knihy a dostupna sirka na lepsie pochopenie kodu");
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj sirku policky: ");
		double sirka = x.nextDouble();
		double s = 0;
		ArrayList<Double> sirky = new ArrayList<>();
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\knihovnik.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			while((riadok = vstup.readLine())!=null) {
				double a = Double.parseDouble(riadok);
				s += a;
				sirky.add(a);
			}
			vstup.close();
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		if (sirka >= s) {
			System.out.println("Zmestia sa do jednej policky");
		}
		else {
			System.out.println("Nezmestia sa do jednej policky");
		}
		int kolko = 1;
		//musim mat premennu, v ktorej si pamatam povodnu sirku policky
		//pretoze budem pridavat knihy a tym sa bude zmensovat sirka policky
		double povodna = sirka;
		for (int i = 0; i < sirky.size(); i++) {
			//ak sa zmesti tak ju tam proste daj a zmensi sirku
			//v druhom pripade sa nezmesti, zvys pocet policiek a resetni sirku policky na povodnu
			//rovno tam vloz aktualnu knihu(zrejme to mozeme spravit, lebo sirka knihy nemoze byt vacsia ako sirka policky)
			System.out.print(sirky.get(i)+ " ");
			if(sirka - sirky.get(i) < 0) {
				++kolko;
				sirka = povodna;
				
			}
			sirka -= sirky.get(i);
			System.out.println(sirka);
			
		}
		System.out.println("Knihovnik bude potrebovat " + kolko + " policiek");
	}

}
