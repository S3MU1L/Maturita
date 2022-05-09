package sada6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class uloha1 extends JFrame implements ActionListener{
	private GridBagConstraints gbc;
	private BufferedImage Canvas;
	private JLabel l;
	private JLabel l1;
	private SpinnerNumberModel model;
	private JSpinner spin1;
	private Graphics g;
	private JLabel polomer;
	private JSpinner spin2;
	private JButton farba;
	private JButton kresli;
	private JButton vymaz;
	private Color color;
	private JButton koniec;
	private int r;
	private int n;
	private Random rnd;
	private int x;
	private int y;
	private SpinnerNumberModel model2;
	public uloha1() {
		setSize(700,700);
		setLayout(new GridBagLayout());
		rnd = new Random();
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		Canvas = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
		l = new JLabel(new ImageIcon(Canvas));
		g = Canvas.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
		g.setColor(color.BLACK);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 5;
		add(l,gbc);
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = 1;
		l1 = new JLabel("Pocet kruznic");
		add(l1,gbc);
		model = new SpinnerNumberModel(10,5,300,5);
		spin1 = new JSpinner(model);
		gbc.gridx = 1;
		add(spin1,gbc);
		gbc.gridx=2;
		polomer = new JLabel("Polomer :");
		add(polomer,gbc);
		gbc.gridx=3;
		model2 = new SpinnerNumberModel(10,5,300,5);
		spin2 = new JSpinner(model2);
		add(spin2,gbc);
		gbc.gridy = 2;
		gbc.gridx = 0;
		farba = new JButton("Farba");
		add(farba,gbc);
		farba.addActionListener(this);
		gbc.gridx = 1;
		kresli = new JButton("Kresli"); 
		add(kresli,gbc);
		kresli.addActionListener(this);
		gbc.gridx = 2;
		vymaz = new JButton("Vymaz");
		add(vymaz,gbc);
		vymaz.addActionListener(this);
		gbc.gridx =3;
		koniec = new JButton("Koniec");
		add(koniec,gbc);
		koniec.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
public static void main(String[] args) {
	new uloha1();
}
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	if (e.getSource()==koniec) {
		dispose();
	}
	if (e.getSource()==vymaz) {
		g.setColor(Color.white);
		g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
		g.setColor(color);
	}
	if (e.getSource()==farba) {
		color = JColorChooser.showDialog(this, "Vyber si farbu", color);
		g.setColor(color);
	}
	if (e.getSource()==kresli) {
		r =  (int) spin2.getValue();
		n = (int) spin1.getValue();
		for (int i 	= 0; i < n; i++) {
			x = rnd.nextInt(Canvas.getWidth()-2*r);
			y = rnd.nextInt(Canvas.getHeight()-2*r);
			g.drawOval(x, y, 2*r, 2*r);
		}
	}
}
}
