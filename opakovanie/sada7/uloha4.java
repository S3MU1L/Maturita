package sada7;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class uloha4 extends JFrame{
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
public uloha4() {
	// TODO Auto-generated constructor stub
	setSize(500,500);
	Canvas = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l);
	g = Canvas.getGraphics();
	g.setColor(Color.white);
	g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
	int xzac = 0;
	int xkon = Canvas.getWidth()-50;
	int yzac = 0;
	int x;
	while(yzac <= Canvas.getHeight()) {
		x = xzac;
		while(x <= xkon) {
			g.setColor(Color.green);
			g.fillOval(x, yzac, 50, 50);
			g.setColor(Color.black);
			g.drawOval(x, yzac, 50, 50);
			g.drawRect(x, yzac, 50, 50);
			x += 50;
		}
		yzac += 50;
		xzac += 25;
		xkon -= 25;
	}
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha4();
	}

}
