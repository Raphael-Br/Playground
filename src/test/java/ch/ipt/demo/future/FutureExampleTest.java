package ch.ipt.demo.future;

import ch.ipt.demo.future.FutureExample;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

class FutureExampleTest {

	@Test
	void futureTest() throws ExecutionException, InterruptedException {
		System.out.println(FutureExample.calculate(50).get());
		System.out.println(FutureExample.calculate(50).get());
		System.out.println(FutureExample.calculate(50).get());
	}

}