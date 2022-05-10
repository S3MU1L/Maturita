package sada6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class uloha8 extends JFrame implements ActionListener, MouseListener{
private GridBagConstraints gbc;
private BufferedImage Canvas;
private JLabel l;
private Graphics g;
private JRadioButton rkruz, rstvor;
private SpinnerNumberModel model;
private JSpinner spin;
private JButton farba, vymaz, koniec;
public uloha8() {
	// TODO Auto-generated constructor stub
	setSize(600,600);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	gbc.insets = new Insets(5, 5, 5, 5);
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.gridheight = 7;
	Canvas = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	add(l,gbc);
	gbc.gridheight = 1;
	g = Canvas.getGraphics();
	gbc.gridx = 1;
	rkruz = new JRadioButton("Kruznica");
	add(rkruz, gbc);
	rkruz.addActionListener(this);
	gbc.gridy = 1;
	rstvor = new JRadioButton("Stvorec");
	add(rstvor, gbc);
	rstvor.addActionListener(this);
	gbc.gridy = 2;
	model = new SpinnerNumberModel(10, 5, 100, 5);
	spin = new JSpinner(model);
	add(spin, gbc);
	gbc.gridy = 3;
	farba = new JButton("farba");
	add(farba, gbc);
	farba.addActionListener(this);

	gbc.gridy = 4;
	vymaz = new JButton("vymaz");
	add(vymaz, gbc);
	vymaz.addActionListener(this);
	
	gbc.gridy = 5;
	koniec = new JButton("koniec");
	add(koniec, gbc);
	koniec.addActionListener(this);
	
	g.setColor(Color.white);
	g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
	g.setColor(Color.black);
	
	l.addMouseListener(this);
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new uloha8();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == koniec) {
			dispose();
		}
		if (e.getSource() == vymaz) {
			Color povodna = g.getColor();
			g.setColor(Color.white);
			g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
			g.setColor(povodna);
			repaint();
		}
		if (e.getSource() == farba) {
			Color f = JColorChooser.showDialog(farba, getTitle(), getForeground());
			g.setColor(f);
		}
		
		if (e.getSource() == rkruz) {
			rstvor.setSelected(false);
		}
		
		if (e.getSource() == rstvor) {
			rkruz.setSelected(false);
		}
			
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		repaint();
		if (rkruz.isSelected()) {
			int r = (int)spin.getValue();
			g.drawOval(x-r, y-r, 2*r, 2*r);
		}
		if (rstvor.isSelected()) {
			int a = (int)spin.getValue();
			g.drawRect(x-a/2, y-a/2, a, a);
			
		}
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
