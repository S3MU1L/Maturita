package sada1;

import java.util.ArrayList;
import java.util.Random;

public class uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>zisky = new ArrayList<>();
		ArrayList<Integer>vydaje = new ArrayList<>();
		String mesiace[] = {"Januar","Februar","Marec","April","Maj","Jun","Jul","August","September","Oktober","November","December"};
		ArrayList<String>uspesne = new ArrayList<>();
		
		Random rnd = new Random();
		for (int i = 0; i < 12; i++) {
			int zisk = rnd.nextInt(2001);
			zisky.add(zisk);
			int vyd = rnd.nextInt(2001)-2000;
			System.out.println(vyd+ " "+ zisk);
			vydaje.add(vyd);
			
		}
		for (int i = 0; i < 12; i++) {
			if (zisky.get(i)+vydaje.get(i)>0) {
				uspesne.add(mesiace[i]);
			}
			
		}
		for (int i = 0; i < uspesne.size(); i++) {
			System.out.print(uspesne.get(i)+ " ");
			
		}
	
	}

}
