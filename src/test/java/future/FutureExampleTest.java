package future;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

class FutureExampleTest {

	@Test
	public void futureTest() throws ExecutionException, InterruptedException {
		System.out.println(FutureExample.calculate(50).get());
		System.out.println(FutureExample.calculate(50).get());
		System.out.println(FutureExample.calculate(50).get());
	}

}