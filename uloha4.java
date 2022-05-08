package sada10;

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
	
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha4();		
	}

}
