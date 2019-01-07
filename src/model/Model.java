package model;

import java.util.Arrays;

import client.PropertyHandler;

public class Model {
	private GameObject[] walls;
	private GameObject[] fruits;
	private GameObject[] coins;
	private GameObject[] ghosts;
	private Pacman pacman;
	private Score score;
	
	public Model() {
		createPacman();
	}
	
	private void createPacman() {
		int blockSize = PropertyHandler.getPropertyAsInt("view.blocksize");
		Integer pacmanPos[] = { 15*blockSize, 19*blockSize };
		this.pacman = new Pacman(ObjectType.PACMAN, pacmanPos, null);
	}

	private void createGhost(int[] position, int[] color) {
		// TODO Auto-generated method stub
		
	}

	private void createWall(int[] start, int[] end) {
		// TODO Auto-generated method stub
		
	}

	private void createFruit(int[] position) {
		// TODO Auto-generated method stub
		
	}

	private void createCoin(int[] position) {
		// TODO Auto-generated method stub
		
	}


	public int calculateScore() {
		// TODO Auto-generated method stub
		return pacman.getCoinsEaten() * 10;
	}

	public Pacman getPacman() {
		return pacman;
	}	
}
