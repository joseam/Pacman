package model;

public class Pacman extends GameObject implements IFigure {
	private int coinsEaten;
	private int fruitsEaten;
	private int ghostsEaten;
	private int hearts;	
	
	public Pacman(ObjectType type, Integer[] position, Integer[] color) {
		super(type, position, color);
		this.coinsEaten = 0;
		this.fruitsEaten = 0;
		this.ghostsEaten = 0;
		this.hearts = 3;
	}
	
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
	}
	
	public void eatCoin() {
		
	}
	
	public void eatGhost() {
		
	}
	
	public void eatFruit() {
		
	}
	
	public boolean loseHeart() {
		return false;
	}

}
