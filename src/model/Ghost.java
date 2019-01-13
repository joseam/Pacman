package model;

import java.awt.Image;

import javax.swing.ImageIcon;

import model.Model.DIRECTION;

public class Ghost extends GameObject implements IFigure {
	private boolean isEdible;
	private String name;
	
	public Ghost(int[] position, String name) {
		super(position);
		this.isEdible = false;
		this.name = name;
		
		this.setPng(DIRECTION.RIGHT);
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		this.setPng(DIRECTION.RIGHT);
	}

	public void setIsEdible(boolean isEdible) {
		this.isEdible = isEdible;
	}
	
	public boolean isGhostDeadOnCollision() {
		return false;
	}

	@Override
	public void setPng(DIRECTION direction) {
		String path = "";
		if (isEdible) {
			path = "img/scared_" + direction.toString().toLowerCase() + ".png";
		} else {
			path = "img/" + this.name + "_" + direction.toString().toLowerCase() + ".png";
		}
		
		super.png = new ImageIcon(path).getImage();
	}
}
