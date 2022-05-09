package sada6;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class uloha2 extends JFrame implements ActionListener{
private GridBagConstraints gbc;
private DefaultListModel<String> model;
private JList list;
private JLabel lpocet;
private JLabel lpriemer;
private JLabel lmax;
private JLabel lmin;
private JButton vyhodnot;
private JButton zmaz;
private FileReader f;
private BufferedReader vstup;
private JScrollPane scrol;
public uloha2() {
	setSize(700,700);
	setLayout(new GridBagLayout());
	gbc=  new GridBagConstraints();
	gbc.insets = new Insets(5, 5, 5, 5);
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.gridheight = 8;
	model = new DefaultListModel<String>();
	list = new JList<>(model);
	scrol = new JScrollPane(list);
	scrol.setPreferredSize(new Dimension(200,500));
	add(scrol,gbc);
	gbc.gridheight = 1;
	gbc.gridx =1;
	lpocet = new JLabel("");
	add(lpocet,gbc);
	gbc.gridy = 1;
	lpriemer = new JLabel("");
	add(lpriemer,gbc);
	gbc.gridy = 2;
	lmax = new JLabel("");
	add(lmax,gbc);
	gbc.gridy = 3;
	lmin = new JLabel("");
	add(lmin,gbc);
	gbc.gridy = 4;
	vyhodnot = new JButton("VYHODNOT");
	add(vyhodnot,gbc);
	vyhodnot.addActionListener(this);
	gbc.gridy = 5;
	zmaz = new JButton("ZMAZ");
	add(zmaz,gbc);
	zmaz.addActionListener(this);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==vyhodnot) {
			try {
				f = new FileReader("firma.txt");
				vstup = new BufferedReader(f);
				String riadok = "";
				int sucet = 0;
				int pocet = 0;
				ArrayList<Integer>platy = new ArrayList<>();
				while ((riadok=vstup.readLine())!=null) {
					model.addElement(riadok);
					pocet++;
					sucet += Integer.parseInt(riadok);
					platy.add(Integer.parseInt(riadok));
				}
				vstup.close();
				lpocet.setText("Pocet zamestnancov : "+Integer.toString(pocet));
				double priemer = (double)sucet/pocet;
				lpriemer.setText("Priemerny plat: "+Double.toString(priemer));
				int max = Collections.max(platy);
				lmax.setText("Maximalny plat: "+Integer.toString(max));
				int min = Collections.min(platy);
				lmin.setText("Minimalny plat: "+Integer.toString(min));
			} catch (IOException e2) {
				System.out.println("Subor sa nenasiel");
			}
		}
		if (e.getSource()==zmaz) {
			model.clear();
			lmax.setText("");
			lmin.setText("");
			lpocet.setText("");
			lpriemer.setText("");
		}
		
	}

}
