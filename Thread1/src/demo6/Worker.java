package demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	private Random random = new Random();

	private void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();

			}
			list1.add(random.nextInt(100));
		}
	}

	private synchronized void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public static void main(String[] args) {
		final Worker worker = new Worker();
		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				worker.process();
			}
		});
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken = " + (end - start));
		System.out.println("List1 size:" + worker.list1.size() + " List2 size:"
				+ worker.list2.size());
	}

}
