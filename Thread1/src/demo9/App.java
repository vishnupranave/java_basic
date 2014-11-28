package demo9;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {
		Thread producer = new Thread(new Runnable() {

			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread consumer = new Thread(new Runnable() {

			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		producer.start();
		consumer.start();

	}

	private static void producer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			queue.put(random.nextInt(100));
		}
	}

	private static void consumer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				Integer value = queue.take();
				System.out.println("Taken value: " + value + "; Queue Size: "
						+ queue.size());
			}
		}

	}

}
