package graphics;

import java.awt.Image;
import java.io.File;
import java.util.Hashtable;

import javax.swing.ImageIcon;

public class Paint {
	public static Hashtable<String, Image> images = new Hashtable<String, Image>();
	
	public static Image image(String name) {
		return images.get(name);
	}

	public static void loadImages(){
		String imageDir = "C:/Users/Zadow/Documents/00Abolished/GraphicalResources/";		
		
		File dir = new File(imageDir);
		for (File file : dir.listFiles()) {		
			String name = file.getName().split("[.]")[0];
			images.put(name, new ImageIcon(file.getPath()).getImage());			
		}		
	}
	

//	private Image background01, background02, hero, dbImage;
//	private Graphics dbGraphics;
//	private int x, y;
//	
//	public void loadImages(){
//		ImageIcon i1 = new ImageIcon("C:/Users/Zadow/Documents/00Abolished/background.png");
//		background01 = i1.getImage();
//		background02 = i1.getImage();
//		ImageIcon i2 = new ImageIcon("C:/Users/Zadow/Documents/00Abolished/hero.png");
//		hero = i2.getImage();
//		
//	}
//	
//	public void paint(Graphics g){
//	dbImage = createImage(getWidth(), getHeight());
//	dbGraphics = dbImage.getGraphics();
//	paintComponent(dbGraphics);
//	g.drawImage(dbImage, 0, 0, this);
//	}
//	
//	public void paintComponent(Graphics g){
//		g.drawImage(background01, 0, 0, this);
//		g.drawImage(hero, x, y, this);
//		repaint();
//	}
	
}

