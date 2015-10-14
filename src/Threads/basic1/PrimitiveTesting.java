package Threads.basic1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class PrimitiveTesting {
	private class IntRunner implements Runnable {
		public void run() {
			try {
				// need a yield
				Thread.sleep(1);
			} catch (InterruptedException ignore) {
			}
			// adjust the int
			i++;
			i--;
			// adjust the Atomic int
			ai.addAndGet(1);
			ai.addAndGet(-1);
		}
	}

	private int i;
	private AtomicInteger ai;
	private ExecutorService executor = Executors.newCachedThreadPool();

	public void testPrimitive() throws InterruptedException {
		i = 0;
		ai = new AtomicInteger(0);
		for (int i = 0; i < 1000; i++) {
			executor.execute(new IntRunner());
		}
		executor.shutdown();
		executor.awaitTermination(1L, TimeUnit.SECONDS);

		System.out.println("Primitive int Value=" + i);
		System.out.println("AtomicInteger Value=" + ai.get());
	}

	public static void main(String[] args) throws InterruptedException {
		PrimitiveTesting test = new PrimitiveTesting();
		test.testPrimitive();
	}
}