package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 11.04.17.
 */
public class Snake {
	private List<SnakeSection> sections;
	private boolean isAlive;
	private SnakeDirection direction;
	private int x;
	private int y;

	public List<SnakeSection> getSections() {
		return sections;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public SnakeDirection getDirection() {
		return direction;
	}

	public void setDirection(SnakeDirection direction) {
		this.direction = direction;
	}

	public int getX() {
		return sections.get(0).getX();
	}

	public int getY() {
		return sections.get(0).getY();
	}

	public void move() {}

	public Snake(int x, int y) {
		this.x = x;
		this.y = y;
		sections = new ArrayList<>();
		sections.add(new SnakeSection(x,y));
		this.isAlive = true;
	}
}
