package controller;

import connection.Connection;
import model.Model;
import view.View;

public class GameController implements ICallback {
	private Model m;
	private View v;
	private Connection server;
		
	public GameController(Model m, View v) {
		this.m = m;
		this.v = v;
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
