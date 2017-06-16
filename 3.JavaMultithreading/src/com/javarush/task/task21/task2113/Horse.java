package com.javarush.task.task21.task2113;

/**
 * Created by igor on 06.04.17.
 */
public class Horse {
	private String name;
	private double speed;
	private double distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void move(){
		distance += getSpeed() * Math.random();
	}

	public void print(){
		StringBuilder point = new StringBuilder();
		for (int i = 0; i < Math.round(getDistance());  i++)
			point.append(".");

		point.append(getName());
		System.out.println(point.toString());
	}

	public Horse(String name, double speed, double distance) {
		this.name = name;
		this.speed = speed;
		this.distance = distance;
	}
}
