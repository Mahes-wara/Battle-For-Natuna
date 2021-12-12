package com.duffaldri;

import java.awt.*;

public class Player {
	float x, y;
	float radius;
	private Color color;
	
	public Player(float x, float y, float radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public void draw (Graphics g) {
		g.setColor(color);
		g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius), (int) (2 * radius));
	}
	
//	public void collide (BallArea box) {
//		float ballMinX = box.minX + radius;
//		float ballMinY = box.minY + radius;
//		float ballMaxX = box.maxX - radius;
//		float ballMaxY = box.maxY - radius;
//		
//		x += speedX;
//		y += speedY;
//		
//		if (x < ballMinX) {
//			speedX = -speedX;
//			x = ballMinX;
//		} else if (x > ballMaxX) {
//			speedX = -speedX;
//			x = ballMaxX;
//		}
//		
//		if (y < ballMinY) {
//			speedY = -speedY;
//			y = ballMinY;
//		} else if (y > ballMaxY) {
//			speedY = - speedY;
//			y = ballMaxY;
//		}
//	}
}
