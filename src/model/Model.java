package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;

import client.PropertyHandler;

public class Model {
	private List<GameObject> fruits;
	private GameObject[] ghosts;
	private Pacman pacman;
	private Score score;
	
	public static enum DIRECTION {
		UP,
		RIGHT,
		DOWN,
		LEFT
	}
	
	public Model() {
		this.fruits = new ArrayList<GameObject>();
		createPacman();
	}
	
	private void createPacman() {
		int blockSize = PropertyHandler.getPropertyAsInt("view.blocksize");
		int pacmanPos[] = { 15*blockSize, 19*blockSize };
		this.pacman = new Pacman(pacmanPos);
	}

	private void createGhost(int[] position, int[] color) {
		// TODO Auto-generated method stub
		
	}

	public void createFruit(int[] position) {
		this.fruits.add(new Fruit(position));
	}

	public int calculateScore() {
		return pacman.getCoinsEaten() * 10 + pacman.getFruitsEaten() * 50;
	}

	public Pacman getPacman() {
		return pacman;
	}
	
	public List<GameObject> getFruits() {
		return this.fruits;
	}
}
