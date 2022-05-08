package sada7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class uloha3 extends JFrame{
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
public uloha3() {
	// TODO Auto-generated constructor stub
	setSize(500,500);
	Canvas = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l);
	g = Canvas.getGraphics();
	int xzac = Canvas.getWidth()/2-25;
	int xkon = xzac;
	int yzac = 0;
	int x = 0;
	g.setColor(Color.yellow);
	while(yzac <= Canvas.getHeight()) {
		x = xzac;
		while(x <= xkon) {
			g.fillRect(x, yzac, 50, 50);
			g.setColor(Color.black);
			g.drawRect(x, yzac, 50, 50);
			g.setColor(Color.yellow);
			x += 50;
		}
		yzac += 50;
		xzac -= 25;
		xkon += 25;
	}
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha3();
	}

}
