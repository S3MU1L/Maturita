package sada9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\skoky.txt");
	BufferedReader vstup = new BufferedReader(f);
	String riadok = "";
	ArrayList<Double>skoky = new ArrayList<>();
	ArrayList<String>sutaze = new ArrayList<>();
	ArrayList<Integer>body = new ArrayList<>();
 	int euro = 0;
	int svet = 0;
	int olymp = 0;
	while((riadok = vstup.readLine())!= null) {
		System.out.println(riadok);
		String data[] = riadok.split(" ");
		skoky.add(Double.parseDouble(data[2]));
		sutaze.add(data[0]);
		body.add(Integer.parseInt(data[3]));
		if (data[0].equals("MS")) {
			svet += Integer.parseInt(data[3]);
		}
		else if(data[0].equals("ME")) {
			euro += Integer.parseInt(data[3]);
		}
		else {
			olymp += Integer.parseInt(data[3]);
		}
	}
	vstup.close();
	double naj = Collections.max(skoky);
	for (int i = 0; i < skoky.size(); i++) {
		if (skoky.get(i) == naj) {
			System.out.println("Najlepsi skok :" + skoky.get(i)+ " " + sutaze.get(i)+ " "+ body.get(i));
		}
		
	}
	String nazvy[] = {"majstrovstva europy","majstrovstva sveta","olympiada"};
	ArrayList<Integer>typ = new ArrayList<>();
	typ.add(euro);
	typ.add(svet);
	typ.add(olymp);
	int naj2 = Collections.max(typ);
	System.out.print("Celkovo ziskal najviac bodov na sutazi :");
	for (int i = 0; i < 3; i++) {
		if (naj2 == typ.get(i)) {
			System.out.println(nazvy[i]);
		}		
	}

} catch (IOException e) {
	System.out.println("Subor sa nenasiel");
}
	}

}
