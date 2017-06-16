package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 06.04.17.
 */
public class Hippodrome {
	private static List<Horse> horses = new ArrayList<>();

	public List<Horse> getHorses() {
		return horses;
	}

	public static Hippodrome game;

	public void run() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			move();
			print();
			Thread.sleep(200);
		}
	}

	public void move(){
		for (Horse horse : getHorses())
			horse.move();
	}

	public void print(){
		for (Horse horse : getHorses())
			horse.print();
		for (int i = 0; i < 10; i++)
			System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		game = new Hippodrome();

		game.horses.add(new Horse("Tommy", 3, 0));
		game.horses.add(new Horse("Jake", 3, 0));
		game.horses.add(new Horse("Igor", 3, 0));

		game.run();

	}
}
