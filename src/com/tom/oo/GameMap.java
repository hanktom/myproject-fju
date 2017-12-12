package com.tom.oo;

import java.awt.Canvas;
import java.awt.Graphics;

public class GameMap extends Canvas {
	int pos = 0;
	int row = 3;
	int col = 5;
	int r = 20;
	@Override
	public void paint(Graphics g) {
		g.drawOval((pos%col)*r, (pos/col)*r, r*2, r*2);
	}
	
	public void move(int pos){
		this.pos = pos;
		repaint();
	}
}
