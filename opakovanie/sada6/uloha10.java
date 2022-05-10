package sada6;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class uloha10 extends JFrame implements ActionListener{
private GridBagConstraints gbc;
private JButton otvor;
private JButton uloz;
private JButton text;
private JButton textpoz;
private BufferedImage Canvas;
private JLabel l;
private DefaultListModel<String> model;
private JList list;
private JScrollPane scrol;
private FileReader f;
private BufferedReader vstup;
public uloha10() {
	setSize(600,600);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.insets = new Insets(5, 5, 5, 5);
	otvor = new JButton("OTVOR");
	add(otvor,gbc);
	gbc.gridy = 1;
	uloz = new JButton("ULOZ");
	add(uloz,gbc);
	gbc.gridy = 2;
	text = new JButton("Farba textu");
	add(text,gbc);
	gbc.gridy = 3;
	textpoz = new JButton("Farba pozadia");
	add(textpoz,gbc);
	gbc.gridy = 0;
	gbc.gridx = 1;
	gbc.gridheight = 6;
	model = new DefaultListModel<String>();
	list = new JList<>(model);
	scrol = new JScrollPane(list);
	scrol.setPreferredSize(new Dimension(400,500));
	add(scrol,gbc);
	otvor.addActionListener(this);
	uloz.addActionListener(this);
	text.addActionListener(this);
	textpoz.addActionListener(this);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha10();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==otvor) {
			try {
				f = new FileReader("odpoved.txt");
				vstup = new BufferedReader(f);
				String riadok = "";
				while((riadok = vstup.readLine())!= null) {
					model.addElement(riadok);
				}
				vstup.close();
			} catch (IOException e2) {
				System.out.println("Subor sa nenasiel");
			}
		}
		
		if (e.getSource()==textpoz) {
			Color farba = JColorChooser.showDialog(this, getTitle(), getForeground());
			list.setBackground(farba);
		}
		if (e.getSource()==text) {
			Color farba = JColorChooser.showDialog(this, getTitle(), getForeground());
			list.setForeground(farba);
		}
		
		
	}

}
