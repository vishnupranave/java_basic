package demo11;

import java.util.LinkedList;

class Processor {
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	void producer() throws InterruptedException {

		int value = 0;
		while (true) {
			synchronized (lock) {
				while (list.size() == LIMIT) {
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}
	}

	void consumer() throws InterruptedException {

		while (true) {
			synchronized (lock) {
				Thread.sleep(1000);
				while (list.size() == 0) {
					lock.wait();
				}
				System.out.println("List size = " + list.size());
				int value = list.removeFirst();
				System.out.println("; value = " + value);
				lock.notify();
			}
		}
	}
}

public class App {

	public static void main(String[] args) {
		final Processor p = new Processor();

		Thread producer = new Thread(new Runnable() {
			public void run() {
				try {
					p.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread consumer = new Thread(new Runnable() {
			public void run() {
				try {
					p.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producer.start();

		consumer.start();
	}

}
