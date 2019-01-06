package model;

import java.awt.Image;

import javax.swing.ImageIcon;

import client.PropertyHandler;

public class Pacman extends GameObject implements IFigure {
	private int coinsEaten;
	private int fruitsEaten;
	private int ghostsEaten;
	private int hearts;
	private Image image;
	
	public Pacman(ObjectType type, Integer[] position, Integer[] color) {
		super(type, position, color);
		this.coinsEaten = 0;
		this.fruitsEaten = 0;
		this.ghostsEaten = 0;
		this.hearts = 3;
	}
	
	@Override
	public void move(int dx, int dy) {
		int speed = PropertyHandler.getPropertyAsInt("speed.pacman");
		super.position[0] += (dx * speed);
		super.position[1] += (dy * speed);
	}
	
	public void eatCoin() {
		coinsEaten++;
	}
	
	public void eatGhost() {
		
	}
	
	public void eatFruit() {
		
	}
	
	public boolean loseHeart() {
		return false;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getCoinsEaten() {
		return coinsEaten;
	}
}
