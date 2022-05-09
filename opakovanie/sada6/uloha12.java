package sada6;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class uloha12 extends JFrame implements ActionListener{
private GridBagConstraints gbc;
private JTextField tf;
private JButton bvyska;
private DefaultListModel listmod;
private JList list;
private JScrollPane scrol;
private JButton bvyh;
private int maximalna;
private double priemer;
private int sucet;
private int pocet;
public uloha12() {
	setSize(600,500);
	setLayout(new FlowLayout());
	tf= new JTextField(10);
	bvyska = new JButton("VYSKA");
	bvyska.addActionListener(this);
	listmod = new DefaultListModel<String>();
	list = new JList<>(listmod);
	scrol = new JScrollPane(list);
	bvyh = new JButton("VYHODNOT");
	bvyh.addActionListener(this);
	add(tf);
	add(bvyska);
	add(scrol);
	add(bvyh);
	maximalna = -999;
	pocet =0;
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha12();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bvyska) {
			listmod.addElement(tf.getText());
			pocet++;
			if (Integer.parseInt(tf.getText())>maximalna) {
				maximalna=Integer.parseInt(tf.getText());
			}
			tf.setText("");
			tf.requestFocus(true);
		}
		if (e.getSource()==bvyh) {
			listmod.addElement("Maximalna vyska je "+ Integer.toString(maximalna));
			listmod.addElement("Prihlasenych je "+ Integer.toString(pocet));
			tf.setText("");
			tf.requestFocus(true);
		}
		
	}

}
