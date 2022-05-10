package sada6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class semaforPreErika extends JFrame implements ActionListener{
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
private GridBagConstraints gbc;
private JButton start;
private Timer t;
private Timer t2;
private int xzac;
private int yzac;
private int vyska;
private int sirka;
private int rychlost;
private boolean cervena;
private int stav;
private int limit;
private int hranica;
private boolean c;
public semaforPreErika() {
	// TODO Auto-generated constructor stub
	setSize(700,300);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	gbc.gridx = 0;
	gbc.gridy = 0;
	start = new JButton("Start");
	add(start, gbc);
	start.addActionListener(this);
	gbc.gridy = 1;
	Canvas = new BufferedImage(700, 300, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l, gbc);
	g = Canvas.getGraphics();
	prekresli();
	t = new Timer(1000, this);
	xzac = 0;
	yzac = 275;
	vyska = 25;
	sirka = 50;
	rychlost = 10;
	stav = 0;
	limit = 600;
	hranica = 70;
	zelena();
	kresli_auto();
	kresli_hranicu();
	t2 = new Timer(50, this);
	//stav 0 2 4 ...znamena, ze svieti len zelena
	// stav 1 3 5 ... znamena, ze svieti len cervena
	//c bude boolean, ktory mi hovori, ci je cervena alebo nie
	c = false;
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	private void kresli_hranicu() {
	g.setColor(Color.BLACK);
	g.drawLine(limit, 0, limit, Canvas.getHeight());
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new semaforPreErika();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if (e.getSource() == start) {
			t.start();
		}
		//
		if (e.getSource() == t) {
			prekresli();
			kresli_hranicu();
			if (stav%2==0) {
				zelena();
				c = false;
				t2.start();
			}
			else {
				cervena();
				c = true;
				
			}
			kresli_auto();
			++stav;
		}
		
		if (e.getSource() == t2) {
			prekresli();
			kresli_hranicu();
			//ak je pravda, ze svieti cervena, tak ju vykresli
			if (c) {
				cervena();
			}
			//ak to nie je pravda, tak automaticky svieti zelena(mame len 2 stavy)
			else {
				zelena();
			}
			//ak by som v dalsom kroku bol mimo okraj
			if (xzac + rychlost + sirka > Canvas.getWidth() || xzac + rychlost < 0) {
				rychlost *= -1;
			}
			
			else {
				//ak svieti cervena a vzdialenost od ciary je mensia ako zadana hranica tak sa zastav
				if (c && Math.abs(limit - xzac) <= hranica) {
					t2.stop();
				}
				// inak chod 
				else {
					xzac += rychlost;
				}
			}
			kresli_auto();
		}
		
	}
	private void kresli_auto() {
		g.setColor(Color.blue);
		g.fillRect(xzac, yzac, sirka, vyska);
		
	}
	private void cervena() {
		g.setColor(Color.red);
		g.fillOval(650, 0, 50, 50);
		
	}
	private void zelena() {
		g.setColor(Color.green);
		g.fillOval(650, 100, 50, 50);
		
	}
	private void prekresli() {
		g.setColor(Color.white);
		g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
		
	}

}
