package sada2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class uloha1 extends JFrame implements ActionListener{
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
private int x;
private int posuv;
private String retaz;
private ArrayList<String> retazce;
private Timer t;
public uloha1() {
	setSize(600,600);
	Canvas = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l);
	g = Canvas.getGraphics();
	g.setColor(Color.white);
	g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
	x = 0;
	posuv = 10;
	retaz = "";
	retazce = new ArrayList<String>();
	try {
		FileReader f = new FileReader("C:\\Users\\PC\\Downloads\\tipdna.txt");
		BufferedReader vstup = new BufferedReader(f);
		String riadok = "";
		while ((riadok = vstup.readLine())!=null) {
			retazce.add(riadok);
		}
		vstup.close();
	} catch (IOException e) {
		
	}
	
	Random rnd = new Random();
	int cislo = rnd.nextInt(retazce.size());
	retaz = retazce.get(cislo);
	t = new Timer(100, this);
	t.start();
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new  uloha1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		g.setColor(Color.white);
		g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
		g.setColor(Color.black);
		g.drawString(retaz, x, Canvas.getHeight()/2);
		repaint();
		if (x + posuv > Canvas.getWidth()) {
			x = 0;
		}
		else {
			x += posuv;
		}
		
	}

}
