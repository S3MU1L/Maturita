package sada6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class uloha11 extends JFrame implements ActionListener{
private JButton hore,dole,vpravo,vlavo;
private JTextField tf;
private int posuv;
private JButton vysledok;
private int x;
private int y;
public uloha11() {
	// TODO Auto-generated constructor stub
	
	// v tejto ulohe nepouzivam globalne premenne sirka a vyska, 
	// sirka tlacitka bude 100 a vyska 50
	setSize(500,500);
	setLayout(null);
	hore = new JButton("hore");
	hore.setBounds(70, 0, 100, 50);
	add(hore);
	hore.addActionListener(this);
	dole = new JButton("dole");
	add(dole);
	dole.addActionListener(this);
	dole.setBounds(70,100,100,50);
	vpravo = new JButton("vpravo");
	add(vpravo);
	vpravo.setBounds(120,50,100,50);
	vpravo.addActionListener(this);
	vlavo = new JButton("vlavo");
	vlavo.setBounds(20, 50, 100, 50);
	add(vlavo);
	vlavo.addActionListener(this);
	tf = new JTextField(10);
	tf.setBounds(350,0,150,20);
	tf.setText("Sem zadaj svoje meno");
	add(tf);
	posuv = 20;
	x = 250;
	y = 250;
	vysledok = new JButton();
	vysledok.setText(tf.getText());
	vysledok.setBounds(x,y,100,50);
	vysledok.setBackground(Color.white);
	add(vysledok);
	hore.setBackground(Color.white);
	dole.setBackground(Color.white);
	vpravo.setBackground(Color.white);
	vlavo.setBackground(Color.white);
	
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha11();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		vysledok.setText(tf.getText());
		if (e.getSource() == vpravo) {
			if (x + posuv + 100 <= getWidth()) {
				x += posuv;
			}
		}
		if (e.getSource() == vlavo) {
			if(x - posuv >= 0) {
				x -= posuv;
			}
		}
		if (e.getSource() == dole) {
			if (y + posuv + 50 <= getHeight()) {
				y += posuv;
			}
		}
		if (e.getSource() == hore) {
			if (y - posuv >= 0) {
				y -= posuv;
			}
		}
		
		vysledok.setBounds(x,y,100,50);
	}

}
