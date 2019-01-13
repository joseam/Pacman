package model;

import java.awt.Image;

public class GameObject {
	protected int[] position;
	protected Image png;
	
	public GameObject(int[] position) {
		this.position = position;
	}

	public int[] getPosition() {
		return this.position;
	}

	public Image getPng() {
		return png;
	}
}
