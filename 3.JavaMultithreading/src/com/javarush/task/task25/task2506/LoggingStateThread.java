package com.javarush.task.task25.task2506;

/**
 * Created by igor on 28.05.17.
 */
public class LoggingStateThread extends Thread {
	private Thread thread;

	public LoggingStateThread(Thread thread) {
		this.thread = thread;
		System.out.println(thread.getState());
	}

	@Override
	public void run() {
		Thread.State state = thread.getState();
		while (state != State.TERMINATED) {
			if (state != thread.getState()) {
				state = thread.getState();
				System.out.println(state);
			}
		}
	}
}
