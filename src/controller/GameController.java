package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import client.PropertyHandler;
import connection.Connection;
import model.Model;
import view.BlockElement;
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
			movePacman(-1, 0);
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			movePacman(1, 0);
		} else if (keyCode == KeyEvent.VK_UP) {
			movePacman(0, -1);
		} else if (keyCode == KeyEvent.VK_DOWN) {
			movePacman(0, 1);
		}

		this.v.repaint();
	}

	private void movePacman(int dx, int dy) {
		// If pacman completely in one square
		int blockSize = PropertyHandler.getPropertyAsInt("view.blocksize");

		if (this.m.getPacman().getPosition()[0] % blockSize == 0
				&& this.m.getPacman().getPosition()[1] % blockSize == 0) {
			// Only move, when there is no wall in direction
			if (!isWallNextToPacman(dx, dy)) {
				this.m.getPacman().move(dx, dy);
			}
		} else {
			// Move pacman if possible and eat coin if within square
			if (this.m.getPacman().getPosition()[0] % blockSize == 0 && dx == 0 ||
					(this.m.getPacman().getPosition()[1] % blockSize == 0 && dy == 0)) {
				this.m.getPacman().move(dx, dy);
				isCoinEatable();
			}		
		}

	}

	private void isCoinEatable() {
		int blockSize = PropertyHandler.getPropertyAsInt("view.blocksize");
		int nBlocks = PropertyHandler.getPropertyAsInt("view.nblock");
		int levelData[] = this.v.getLevelData();
		
		int index = this.m.getPacman().getPosition()[0] / blockSize
				+ nBlocks * (int) (this.m.getPacman().getPosition()[1] / blockSize);
		int levelBlock = levelData[index];
		
		if (this.m.getPacman().getPosition()[0] % blockSize == 0
				&& this.m.getPacman().getPosition()[1] % blockSize == 0) {
			// Check if coin is there and eat it
			if ((levelBlock & BlockElement.POINT.getValue()) != 0) {
				this.m.getPacman().eatCoin();
				this.v.setLevelData(index, levelBlock & (BlockElement.POINT.getValue() - 1));
			}
			// Check if fruit is there and eat it
			if ((levelBlock & BlockElement.FRUIT.getValue()) != 0) {
				this.m.getPacman().eatFruit();
				this.v.setLevelData(index, levelBlock & (BlockElement.FRUIT.getValue() - 1));
			}
		}
	}

	private boolean isWallNextToPacman(int dx, int dy) {
		int blockSize = PropertyHandler.getPropertyAsInt("view.blocksize");
		int nBlocks = PropertyHandler.getPropertyAsInt("view.nblock");
		int levelData[] = this.v.getLevelData();
		
		int index = this.m.getPacman().getPosition()[0] / blockSize
				+ nBlocks * (int) (this.m.getPacman().getPosition()[1] / blockSize);
		int levelBlock = levelData[index];
		
		boolean result = false;
		result |= (dx > 0 && (levelBlock & BlockElement.BORDER_RIGHT.getValue()) != 0);
		result |= (dx < 0 && (levelBlock & BlockElement.BORDER_LEFT.getValue()) != 0);
		result |= (dy > 0 && (levelBlock & BlockElement.BORDER_BOTTOM.getValue()) != 0);
		result |= (dy < 0 && (levelBlock & BlockElement.BORDER_TOP.getValue()) != 0);

		return result;
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
