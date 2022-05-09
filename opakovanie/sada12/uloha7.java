package sada12;

import java.util.Scanner;

public class uloha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj nejaky retazec");
		String s = x.next();
		for (int i = 0; i < s.length(); i++) {
			int cis = (int)s.charAt(i);
			String vysledok =  Integer.toBinaryString(cis);
			//ascii ma 8 bitov, takze checknem length tohto stringu a potom dam 0 na zaciatok ak ma menej ako 8
			int nuly = 8 - vysledok.length();
			String pridaj = "";
			for (int j = 0; j < nuly; j++) {
				pridaj += "0";
				
			}
			System.out.println(s.charAt(i) + ":" +pridaj + vysledok  );
			
		}
	}

}
