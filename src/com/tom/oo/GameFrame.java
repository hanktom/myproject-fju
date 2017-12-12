package com.tom.oo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameMap gameMap;
	public GameFrame(){
		setSize(400, 300);
		setLocation(300, 300);
		gameMap = new GameMap();
		add(gameMap);
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_NUMPAD6){
					gameMap.move(gameMap.pos + 1);
				}
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new GameFrame();
	}

}
