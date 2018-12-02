package model;

public interface IModel {
	public void createPacman(int[] position);
	public void createGhost(int[] position, int[] color);
	public void createWall(int[] start, int[] end);
	public void createFruit(int[] position);
	public void createCoin(int[] position);
	public void createScore();
	public int calculateScore();
}
