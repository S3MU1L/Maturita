package grafika_animacie_maturita;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

public class skicar extends JFrame implements AdjustmentListener, ActionListener, MouseMotionListener, MouseListener{
private GridBagConstraints gbc;
private BufferedImage Canvas;
private JLabel l;
private JScrollBar bar;
private JButton farba;
private JButton vymaz;
private Graphics g;
private Color far;
private Graphics2D g2;
private ArrayList<Integer> x;
private ArrayList<Integer> y;
private Color c;
public skicar() {
	setSize(600,600);
	setLayout(new GridBagLayout());
	gbc = new GridBagConstraints();
	gbc.insets = new Insets(5, 5, 5, 5);
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.gridwidth = 4;
	x = new ArrayList<Integer>();
	y = new ArrayList<Integer>();
	Canvas = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);
	l = new JLabel(new ImageIcon(Canvas));
	g = Canvas.getGraphics();
	add(l,gbc);
	bar = new JScrollBar(JScrollBar.HORIZONTAL,1,1,0,10);
	gbc.gridwidth = 1;
	gbc.gridx = 0;
	gbc.gridy = 1;
	add(bar,gbc);
	bar.addAdjustmentListener(this);
	bar.setPreferredSize(new Dimension(300,30));
	gbc.gridx = 1;
	farba = new JButton("FARBA");
	add(farba,gbc);
	farba.addActionListener(this);
	gbc.gridx = 2;
	vymaz = new JButton("VYMAZ");
	vymaz.addActionListener(this);
	add(vymaz,gbc);
	l.addMouseListener(this);
	l.addMouseMotionListener(this);
	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new skicar();
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(bar.getValue()));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==farba) {
			far = JColorChooser.showDialog(this, getTitle(), getForeground());
			g.setColor(far);
		}
		if (e.getSource()==vymaz) {
			c = g.getColor();
			g.setColor(Color.black);
			g.fillRect(0, 0, Canvas.getWidth(), Canvas.getHeight());
			g.setColor(c);
			repaint();
		}
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		int xk = e.getX();
		int yk = e.getY();
		x.add(xk);
		y.add(yk);
		g.drawLine(x.get(x.size()-2), y.get(y.size()-2), x.get(x.size()-1), y.get(y.size()-1));
		
		repaint();
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int xk = e.getX();
		int yk = e.getY();
		x.add(xk);
		y.add(yk);
		
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
