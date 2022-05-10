package sada6;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class uloha4 extends JFrame implements ActionListener{
private GridBagConstraints gbc;
private JTextField tf;
private JRadioButton rdlz;
private JRadioButton rsam;
private JRadioButton rspol;
private JRadioButton rvel;
private JRadioButton rmal;
private JLabel labdlz, labsam, labspo, labvel, labmal;
private String samohlasky;
private String spoluhlasky;
public uloha4() {
	// TODO Auto-generated constructor stub
	setSize(500,500);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	
	gbc.insets = new Insets(5, 5, 5, 5);
	gbc.gridx = 0;
	gbc.gridy = 0;
	tf = new JTextField(10);
	add(tf, gbc);
	
	gbc.gridy = 1;
	rdlz = new JRadioButton("Dlzka mena");
	rdlz.addActionListener(this);
	add(rdlz, gbc);
	gbc.gridx = 1;
	labdlz = new JLabel("");
	add(labdlz, gbc);
	
	gbc.gridx = 0;
	gbc.gridy = 2;
	rsam = new JRadioButton("Samohlasky");
	add(rsam, gbc);
	rsam.addActionListener(this);
	gbc.gridx = 1;
	labsam = new JLabel("");
	add(labsam, gbc);
	
	gbc.gridx = 0;
	gbc.gridy = 3;
	rspol = new JRadioButton("Spoluhlasky");
	add(rspol, gbc);
	rspol.addActionListener(this);
	gbc.gridx = 1;
	labspo = new JLabel("");
	add(labspo, gbc);
	
	gbc.gridy = 4;
	gbc.gridx = 0;
	rvel = new JRadioButton("Velke pismena");
	add(rvel, gbc);
	rvel.addActionListener(this);
	gbc.gridx = 1;
	labvel = new JLabel("");
	add(labvel, gbc);
	
	gbc.gridy  = 5;
	gbc.gridx = 0;
	rmal = new JRadioButton("Male pismena");
	add(rmal, gbc);
	rmal.addActionListener(this);
	gbc.gridx = 1;
	labmal = new JLabel("");
	add(labmal, gbc);
	
	samohlasky = "aeiou";
	//spoluhlasky som daval z hlavy, nie su tam vsetky !
	spoluhlasky = "bdzghvfptcsmjrl";
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String vstup = tf.getText();
		//pre kazdy znak skontrolujem ci je to pismeno
		if (e.getSource() == rdlz) {
			if (rdlz.isSelected()) {
				labdlz.setText(Integer.toString(dlzka(vstup)));
			}
			else {
				labdlz.setText("");
			}
		}
		
		
		if (e.getSource() == rsam) {
			if (rsam.isSelected()) {
				int kolko = 0;
				//musim premenit na male pismena, kedze string samohlasky je vsetko v malom
				vstup = vstup.toLowerCase();
				for (int i = 0; i < vstup.length(); i++) {
					if (samohlaska(vstup.charAt(i))) {
						++kolko;
					}
					
				}
				labsam.setText(Integer.toString(kolko));
			}
			else {
				labsam.setText("");
			}
		}
		
		
		
		if (e.getSource() == rvel) {
			if (rvel.isSelected()) {
				int kolko = 0;
				for (int i = 0; i < vstup.length(); i++) {
					if(vstup.charAt(i) <= 'Z' && vstup.charAt(i) >= 'A') {
						++kolko;
					}
					
				}
				labvel.setText(Integer.toString(kolko));
			}
			else {
				labvel.setText("");
			}
		}
		
		
		
		if (e.getSource() == rmal) {
			if (rmal.isSelected()) {
				int kolko = 0;
				for (int i = 0; i < vstup.length(); i++) {
					if(vstup.charAt(i) <= 'z' && vstup.charAt(i) >= 'a') {
						++kolko;
					}
					
				}
				labmal.setText(Integer.toString(kolko));
			
			}
			else {
				labmal.setText("");
			}
		}
	
		
		if (e.getSource() == rspol) {
			if (rspol.isSelected()) {
				int kolko = 0;
				//na male z rovnakeho dovodu ako pri samohlaskach
				vstup = vstup.toLowerCase();
				for (int i = 0; i < vstup.length(); i++) {
					if (spoluhlaska(vstup.charAt(i))) {
						++kolko;
					}
					
				}
				labspo.setText(Integer.toString(kolko));
			}
			else {
				labspo.setText("");
			
			}
		}
	}
	private boolean spoluhlaska(char c) {
		for (int i = 0; i < spoluhlasky.length(); i++) {
			if (c == spoluhlasky.charAt(i)) {
				return true;
			}
			
		}
		return false;
	}
	
	
	private boolean samohlaska(char c) {
		for (int i = 0; i < samohlasky.length(); i++) {
			if (c == samohlasky.charAt(i)) {
				return true;
			}
			
		}
		return false;
	}
	
	
	private int dlzka(String vstup) {
		int kolko = 0;
		for (int i = 0; i < vstup.length(); i++) {
			if (znak(vstup.charAt(i))) {
				++kolko;
			}
			
		}
		return kolko;
	}
	
	
	private boolean znak(char c) {
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
	}

}
