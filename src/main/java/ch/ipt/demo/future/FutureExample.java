package ch.ipt.demo.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

	private FutureExample() {}

	private static final ExecutorService executor = Executors.newSingleThreadExecutor();

	public static Future<Integer> calculate(Integer input) {
		return executor.submit(() -> {
			Thread.sleep(1000);
			return input * input;
		});
	}

}
