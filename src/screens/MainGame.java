package screens;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import graphics.Paint;
import entities.Hero;

public class MainGame extends JFrame {			
	private Image dbImage;
	private Graphics dbGraphics;
	
	public Hero hero;
	
	// key listener
	public class ActionListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if (keyCode == KeyEvent.VK_LEFT) {
				hero.walkLeft();
			} else if (keyCode == KeyEvent.VK_RIGHT) {
				hero.walkRight();
			} else if (keyCode == KeyEvent.VK_UP) {
				hero.jump();
			} else if (keyCode == KeyEvent.VK_DOWN) {
				hero.crouch();
			} else if (keyCode == KeyEvent.VK_SPACE) {
				hero.stab();
			}
		}
		
		public void keyReleased(KeyEvent e){
			int keyCode = e.getKeyCode();
			
			if (keyCode == KeyEvent.VK_DOWN) {
				hero.releaseCrouch();
			} else if (keyCode == KeyEvent.VK_SPACE) {
				hero.releaseStab();
			}
		}
		
	}
	
	public MainGame() throws Exception {	
		//JPanel panel = new JPanel();
	    Paint.loadImages();
	    hero = new Hero();
	    
		addKeyListener(new ActionListener());
	    setTitle("00Abolished");
	    setSize(608,336);
	    setLocationRelativeTo(null);  // center the frame
		setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
	public void paint(Graphics g){
		dbImage = createImage(getWidth(), getHeight());
		dbGraphics = dbImage.getGraphics();
		paintComponent(dbGraphics);
		g.drawImage(dbImage, 0, 0, this);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(Paint.image("background"), 0, 0, this);
		g.drawImage(hero.frame, hero.x, hero.y, this);
		repaint();
	}
	
	public static void main(String args[]) throws Exception	{ 
		new MainGame();    
	}
}
