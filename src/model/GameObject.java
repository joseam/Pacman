package model;

import java.io.File;

public class GameObject {
	private Integer[] color;
	private Integer[] position;
	private ObjectType type;
	private File png;

	protected GameObject(ObjectType type, Integer[] position, Integer[] color) {
		this.position = position;
		this.color = color;
		this.type = type;
	}
	
	public static GameObject createGameObject(ObjectType type, Integer[] position, Integer[] color) {
		return null;
	}

	public Integer[] getColor() {
		return this.color;
	}

	public Integer[] getPosition() {
		return this.position;
	}
	
	public ObjectType getObjectType() {
		return this.type;
	}

	public File getPng() {
		return png;
	}

	public void setPng(File png) {
		this.png = png;
	}
}
