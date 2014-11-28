package demo1;

import java.io.IOException;

class Runner extends Thread {
	String s;

	Runner(String s) {
		this.s = s;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Runner running " + s + ": " + i);

			try {

				Thread.sleep(90);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}

public class App {

	/*
	 * I am following the Udemy Java multithreading course. You can find the
	 * video lectures at https://www.udemy.com/java-multithreading
	 */
	public static void main(String[] args) throws IOException {
		Runner runner1 = new Runner("Thread1");
		runner1.start();
		Runner runner2 = new Runner("Thread2");
		runner2.start();
		
	}

}
