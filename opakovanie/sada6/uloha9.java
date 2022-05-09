package sada6;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class uloha9 extends JFrame implements ActionListener{
private GridBagConstraints gbc;
private JTextField tfinput;
private JButton bnumber;
private JTextField tfoutput;
private JButton bmirror;
private JRadioButton rdignum;
private JRadioButton rdigsum;
private JRadioButton rdivisible;
private JButton bdelete;
private JLabel ldignum;
private JLabel ldigsum;
private JLabel ldivisible;
private StringBuilder sb;
private int cifier;
private int sucetcifier;
public uloha9() {
	setTitle("Uloha");
	setSize(600,600);
	setLayout(new GridBagLayout());
	sb = new StringBuilder();
	gbc = new GridBagConstraints();
	tfinput = new JTextField(10);
	tfoutput = new JTextField(10);
	bnumber=  new JButton("Citaj cislo");
	bnumber.addActionListener(this);
	bdelete = new JButton("ZMAZ");
	bdelete.addActionListener(this);
	bmirror= new JButton("ZRKADLOVY OBRAZ");
	bmirror.addActionListener(this);
	ldignum = new JLabel("");
	ldigsum = new JLabel("");
	ldivisible = new JLabel("");
	rdignum = new JRadioButton("Pocet Cifier");
	rdignum.addActionListener(this);
	rdigsum = new JRadioButton("Sucet Cifier");
	rdigsum.addActionListener(this);
	rdivisible = new JRadioButton("Delitelne 9");
	rdivisible.addActionListener(this);
	gbc.insets= new Insets(5, 5, 5, 5);
	gbc.fill= GridBagConstraints.BOTH;
	gbc.gridx=0;
	gbc.gridy=0;
	add(tfinput,gbc);
	gbc.gridx=1;
	add(bnumber,gbc);
	gbc.gridx=2;
	add(tfoutput,gbc);
	gbc.gridx=3;
	add(bmirror,gbc);
	gbc.gridx=0;
	gbc.gridy=1;
	add(rdignum,gbc);
	gbc.gridx=1;
	add(ldignum,gbc);
	gbc.gridx=0;
	gbc.gridy=2;
	add(rdigsum,gbc);
	gbc.gridx=1;
	add(ldigsum,gbc);
	gbc.gridy=3;
	gbc.gridx=0;
	add(rdivisible,gbc);
	gbc.gridx=1;
	add(ldivisible,gbc);
	gbc.gridy=4;
	gbc.gridx=0;
	add(bdelete,gbc);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new  uloha9();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bnumber) {
			reset();
			cifier = countdigits(Integer.parseInt(tfinput.getText()));
			sucetcifier = digitsum(Integer.parseInt(tfinput.getText()));
			
		}
		if (e.getSource()==rdignum) {
			if (rdignum.isSelected()) {
				ldignum.setText(Integer.toString(cifier));
			}
			else {
				ldignum.setText("");
			}
		}
		
		if (e.getSource()==rdigsum) {
			if (rdigsum.isSelected()) {
				ldigsum.setText(Integer.toString(sucetcifier));
			}
			else {
				ldigsum.setText("");
			}
		}
		if (e.getSource()==rdivisible) {
			if (rdivisible.isSelected()) {
				if (Integer.parseInt(tfinput.getText())%9==0) {
					ldivisible.setText("ANO");
				}
				else {
					ldivisible.setText("NIE");
				}
			}
			else {
				ldivisible.setText("");
			}
		}
		
		if (e.getSource()==bdelete) {
			tfinput.setText("");
			tfoutput.setText("");
			ldignum.setText("");
			ldigsum.setText("");
			ldivisible.setText("");
			rdignum.setSelected(false);
			rdigsum.setSelected(false);
			rdivisible.setSelected(false);
			cifier=0;
			sucetcifier=0;
			
			
		}
		if (e.getSource()==bmirror) {
			sb.append(tfinput.getText());
			sb.reverse();
			tfoutput.setText(sb.toString());
			sb.delete(0, sb.length());
			}
		
	}
	private void reset() {
		tfoutput.setText("");
		ldignum.setText("");
		ldigsum.setText("");
		ldivisible.setText("");
		rdignum.setSelected(false);
		rdigsum.setSelected(false);
		rdivisible.setSelected(false);
		cifier=0;
		sucetcifier=0;
		
	}
	private int digitsum(int cislo) {
		int suma = 0;
		while (cislo!=0) {
			suma+=cislo%10;
			cislo/=10;
		}
		return suma;
		
	}
	private int countdigits(int cislo) {
		int kolko=0;
		while (cislo!=0) {
			cislo/=10;
			kolko++;
		}
		return kolko;		
	}
}
