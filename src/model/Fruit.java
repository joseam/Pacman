package model;

import java.util.Random;

import javax.swing.ImageIcon;

public class Fruit extends GameObject {
	public Fruit(int[] position) {
		super(position);
		this.setRandomFruit();
	}
	
	public void setRandomFruit() {
		Random rand = new Random();
		String path = "img/fruit_" + rand.nextInt(3) + ".png";
		super.png = new ImageIcon(path).getImage();
	}
}
