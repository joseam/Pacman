package model;

public class Ghost extends GameObject implements IFigure {
	private boolean isEdible;
	private Image image;
	
	public Ghost(ObjectType type, Integer[] position, Integer[] color) {
		super(type, position, color);
		
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
	
	private void changeColor(Integer[] color) {
		
	}
}
