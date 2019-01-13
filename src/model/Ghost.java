package model;

import java.awt.Image;

public class Ghost extends GameObject implements IFigure {
	private boolean isEdible;
	
	public Ghost(int[] position) {
		super(position);
		
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}

	public void setIsEdible(boolean isEdible) {
		this.isEdible = isEdible;
	}
	
	public boolean isGhostDeadOnCollision() {
		return false;
	}
}
