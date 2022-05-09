package sada6;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class uloha13 extends JFrame implements ActionListener{
private JTextField tf;
private JButton b;
private JLabel l;
private Random rnd;
private int pokusy;
private GridBagConstraints gbc;
private JLabel lvstup;
private int spravna;
public uloha13() {
	setTitle("Hadaj cislo");
	setSize(600,600);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	gbc.insets= new Insets(5, 5, 5, 5);
	lvstup = new JLabel("Hadaj cislo");
	tf = new JTextField(10);
	b = new JButton("HADAJ");
	b.addActionListener(this);
	l = new JLabel("");
	rnd = new Random();
	spravna =rnd.nextInt(100)+1;
	pokusy =0;
	gbc.gridx=0;
	gbc.gridy=0;
	add(lvstup,gbc);
	gbc.gridx=1;
	add(tf,gbc);
	gbc.gridx=0;
	gbc.gridy=1;
	add(b,gbc);
	gbc.gridx=1;
	add(l,gbc);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha13();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b) {
			if (Integer.parseInt(tf.getText())>spravna) {
				l.setText("Zadaj mensie cislo");
				pokusy++;
				tf.setText("");
				tf.requestFocus(true);
			}
			else if (Integer.parseInt(tf.getText())<spravna) {
				l.setText("Zadaj vacsie cislo");
				pokusy++;
				tf.setText("");
				tf.requestFocus(true);
			}
			else {
				pokusy++;
				l.setText("Uhadol si, potreboval/a si "+ pokusy +" pokusov");
			}
		}
		
	}

}
