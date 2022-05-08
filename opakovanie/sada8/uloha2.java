package sada8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		String in = x.nextLine();
		String vety[] = in.split("\\.");
		int pocvet = vety.length;
		System.out.println("pocet viet : "+ pocvet );
		int pocslov = 0;
		for (int i = 0; i < vety.length; i++) {
			String slova [] = vety[i].split(" ");
			pocslov+=slova.length;
			
		}
		System.out.println("pocet slov : "+ pocslov);
		double cena = 0.1*pocslov;
		if (pocvet<=10) {
			cena += 0.6;
		}
		else if(pocvet <=20) {
			cena += 1;
		}
		else {
			cena += 1.6;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("celkova cena : " +df.format(cena));
		//uloha 3 je meteo, ktora uz bola riesena v predoslych sadach, a preto tu nie je riesena.
	}

}
