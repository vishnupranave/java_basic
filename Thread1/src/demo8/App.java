package demo8;

import java.util.concurrent.CountDownLatch;

class Service implements Runnable {
	private CountDownLatch latch;
	private String name;

	public Service(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}

	public void run() {
		System.out.println(name + " Thread Started.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}
}

public class App {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		Thread cache = new Thread(new Service(latch, "CacheService"));
		Thread alert = new Thread(new Service(latch, "AlertService"));
		Thread validate = new Thread(new Service(latch, "ValidateService"));

		cache.start();
		alert.start();
		validate.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All Services started.");
	}

}
