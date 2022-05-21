package sada10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class uloha1 {
	private static int[] mesiace;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\vstup1.txt");
			BufferedReader vstup = new BufferedReader(f);
			String riadok = "";
			mesiace = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			while((riadok = vstup.readLine())!=null) {
				String data[] = riadok.split(" ");
				if (neplatny(data[0])) {
					System.out.println(data[0]+ " "+data[1] +" "+ data[2]);
				}
								
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	private static boolean neplatny(String s) {
		String rok = s.substring(0, 4);
		String mesiac = s.substring(4,6);
		String den = s.substring(6,8);
		int cis_mes = Integer.parseInt(mesiac);
		int cis_dni = Integer.parseInt(den);
		//priestupny vyriesim zvlast
		if (priestupny(rok)) {
			if (cis_mes == 2 && cis_dni<=29) {
				return false;
			}
		}
		//Ludia rataju mesiace od 1, ale v nasom poli sa rataju od 0, preto musime odcitat 1 od cisla mesiaca
		if (mesiace[cis_mes-1]<cis_dni) {
			return true;
		}
		return false;
	}

	private static boolean priestupny(String s) {
		int rok = Integer.parseInt(s);
		if ((rok % 400 == 0) || (rok % 4 == 0  && rok % 100 != 0)) {
			return true;
		}
		return false;
	}

}
