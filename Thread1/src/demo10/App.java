package demo10;

import java.util.Scanner;

class Processor {
	void producerOne() throws InterruptedException {
		System.out.println("ProducerOne called....");
		synchronized (this) {
			System.out.println("ProducerOne thread running....");
			wait();
			System.out.println("ProducerOne Resumed.");
		}
	}

	void producerTwo() throws InterruptedException {
		System.out.println("ProducerTwo called....");
		synchronized (this) {
			System.out.println("ProducerTwo thread running....");
			wait();
			System.out.println("ProducerTwo Resumed.");
		}
	}

	void consumer() throws InterruptedException {
		System.out.println("Consumer called....");
		Scanner scan = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("Waiting for return key...");
			scan.nextLine();
			notifyAll();
		}
	}
}

public class App {

	public static void main(String[] args) {
		final Processor p = new Processor();

		Thread producer = new Thread(new Runnable() {
			public void run() {
				try {
					p.producerOne();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread producerTwo = new Thread(new Runnable() {
			public void run() {
				try {
					p.producerTwo();
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
		producerTwo.start();
		consumer.start();
	}
}
