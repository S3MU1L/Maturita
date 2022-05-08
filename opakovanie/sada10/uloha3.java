package sada10;

import java.util.Scanner;

public class uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		String s = "";
		do {
			s = x.next();
			String rok = s.substring(0,2);
			String mesiace = s.substring(2,4);
			String den = s.substring(4,6);
			String pohlavie = "";
			int cis_mes = Integer.parseInt(mesiace);
			if (cis_mes<=12) {
				pohlavie = "muz";
			}
			else {
				pohlavie = "zena";
				cis_mes -= 50;
			}
			int cis_rok = Integer.parseInt(rok);
			String predpona = "";
			if (cis_rok > 22) {
				predpona = "19";
			}
			else if(cis_rok<9) {
				predpona = "200";
			}
			else {
				predpona = "20";
			}
			int cis_den = Integer.parseInt(den);
			System.out.println(pohlavie + ", "+ "narodena/y "+cis_den+". "+cis_mes+". "+predpona+cis_rok );
			
		} while (s != "0");
	}

}
