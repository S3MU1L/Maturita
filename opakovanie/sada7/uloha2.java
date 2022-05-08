package sada7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class uloha2 extends JFrame{
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
public uloha2() {
	// TODO Auto-generated constructor stub
	setSize(400,400);
	Canvas = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l);
	g = Canvas.getGraphics();	
	for (int y = 0; y < 8; y++) {
		if (y%2==0) {
			g.setColor(Color.blue);
			
		}
		else {
			g.setColor(Color.red);
		}
		
		for (int x = 0; x <= y; x++) {
			g.fillRect(x*50, y*50, 50, 50);
			if (g.getColor()==Color.blue) {
				g.setColor(Color.red);
			}
			else {
				g.setColor(Color.blue);
			}
		}
		
	}
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha2();
	}

}
