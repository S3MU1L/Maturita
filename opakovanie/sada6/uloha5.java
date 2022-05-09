package sada6;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class uloha5 extends JFrame implements ActionListener{
private GridBagConstraints gbc;
private JButton b1;
private JButton b2;
private JButton b3;
private JLabel l1;
private JLabel l2;
private JLabel l3;
private int pocet;
private int imax;
private int max;
private JLabel lnaj;
public uloha5() {
	setSize(700,700);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	gbc.insets = new Insets(5, 5, 5, 5);
	gbc.gridx = 0;
	gbc.gridy = 0;
	b1 = new JButton("Jedlo 1");
	b1.addActionListener(this);
	add(b1,gbc);
	gbc.gridx = 1;
	b2 = new JButton("Jedlo 2");
	b2.addActionListener(this);
	add(b2,gbc);
	
	gbc.gridx = 2;
	b3 = new JButton("Jedlo 3");
	b3.addActionListener(this);
	add(b3,gbc);
	gbc.gridx = 0;
	gbc.gridy = 1;
	
	l1 = new JLabel("0");
	add(l1,gbc);
	gbc.gridx = 1;
	l2 = new JLabel("0");
	add(l2,gbc);
	gbc.gridx = 2;
	l3 = new JLabel("0");
	add(l3,gbc);
	gbc.gridx = 0;
	gbc.gridy = 2;
	gbc.gridwidth = 3;
	lnaj = new JLabel("Najviac je: ");
	add(lnaj,gbc);
	max = 0;
	imax = 0;
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			int pocet = Integer.parseInt(l1.getText());
			pocet++;
			if (pocet>max) {
				max = pocet;
				imax = 1;
			}
			l1.setText(Integer.toString(pocet));
		}
		
		if (e.getSource()==b2) {
			int pocet = Integer.parseInt(l2.getText());
			pocet++;
			if (pocet>max) {
				max = pocet;
				imax  = 2;
			}
			l2.setText(Integer.toString(pocet));
		}
		
		if (e.getSource()==b3) {
			int pocet = Integer.parseInt(l3.getText());
			pocet++;
			if (pocet>max) {
				pocet = max;
				imax = 3;
			}
			l3.setText(Integer.toString(pocet));
		}
		
		if (imax==1) {
			lnaj.setText("Najvacsi pocet hlasov ma 1. jedlo");
		}
		else if (imax == 2) {
			lnaj.setText("Najvacsi pocet bodov ma 2. jedlo");
		}
		else {
			lnaj.setText("Najvacsi pocet bodov ma 3. jedlo");
		}
		
	}

}
