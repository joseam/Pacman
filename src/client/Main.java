package client;

import java.awt.EventQueue;

import controller.GameController;
import model.Model;
import view.View;

public class Main {

	public static void main(String[] args) {
		// Start Application
		EventQueue.invokeLater(() -> {
			Model m = new Model();
			View v = new View(m);
			new GameController(m, v);			
		});		
	}
}
