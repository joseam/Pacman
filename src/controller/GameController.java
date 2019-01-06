package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import connection.Connection;
import model.Model;
import view.View;

public class GameController extends KeyAdapter implements ICallback {
	private Model m;
	private View v;
	private Connection server;
		
	public GameController(Model m, View v) {
		this.m = m;
		this.v = v;
		
		this.v.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyPressed(e);
		int keyCode = e.getKeyCode();
		
		if (keyCode == KeyEvent.VK_LEFT) {
			this.v.getPacman().move(-1, 0);
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			this.v.getPacman().move(1, 0);
		} else if (keyCode == KeyEvent.VK_UP) {
			this.v.getPacman().move(0, -1);
		} else if (keyCode == KeyEvent.VK_DOWN) {
			this.v.getPacman().move(0, 1);
		}
		
		this.v.repaint();
	}

	@Override
	public void pacmanDead() {
		// TODO Auto-generated method stub
		
	}
	
	private void updateGhosts() {
	}
	
	private void registerAtServer() {
		
	}
}
