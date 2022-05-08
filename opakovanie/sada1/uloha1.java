package sada1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Zadaj N");
		int n = x.nextInt();
		System.out.println("Zadaj K");
		int k = x.nextInt();
		ArrayList<Integer>pole = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			pole.add(x.nextInt());
			System.out.print(pole.get(i)+" ");
		}
		System.out.println();
		System.out.println("Zrotovane pole : ");
		Collections.rotate(pole, k);
		for (int i = 0; i < n; i++) {
			System.out.print(pole.get(i)+ " ");
			
		}
	}

}
