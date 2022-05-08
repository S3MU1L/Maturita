package sada7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class uloha1 extends JFrame{
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
public uloha1() {
	// TODO Auto-generated constructor stub
	setSize(400,400);
	Canvas = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l);
	g = Canvas.getGraphics();
	for (int y = 0; y < 8; y++) {
		if (y%2==0) {
			g.setColor(Color.white);
		}
		else {
			g.setColor(Color.black);
		}
		for (int x = 0; x < 8; x++) {
				
			g.fillRect(x*50, y*50, 50, 50);
			if (g.getColor() == Color.black) {
				g.setColor(Color.white);
			}
			else {
				g.setColor(Color.black);
			}
		}
		
	}
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha1();
	}

}
