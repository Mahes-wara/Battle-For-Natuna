package com.duffaldri;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet {
	int x, y;
	int speed;
	int width, height;
	private Color color;
	
	public Bullet(int x, int y, int radius, int speed) {
		this.color = Color.red;
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.width = 6;
		this.height = 15;
	}
	
	public void draw (Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
	
	public void move() {
		this.y -= speed;
	}
}
