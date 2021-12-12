package com.duffaldri;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Score {
	int value;
	String text;
	Font font;
	
	public Score() {
		font = new Font("Verdana", Font.BOLD, 20);
		this.value = 0;
		text = "Score = 0 || Klik bola untuk menambah skor!";
	}
	
	public int getValue() {
		return value;
	}

	public void draw (Graphics g) {
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString(text, 5, 25);
	}
	
	public void addValue() {
		this.value++;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
