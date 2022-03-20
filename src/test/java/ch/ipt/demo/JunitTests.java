package ch.ipt.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JunitTests {

	@Test
	void assertException() {
		int[] testArray = {123};
		Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> System.out.println(testArray[1]));
		assertEquals("Index 1 out of bounds for length 1", exception.getMessage());
	}

	@Tag("ci")
	@RepeatedTest(3)
	void repeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.printf("%s: Executing repeated test %s%n",repetitionInfo.getCurrentRepetition(),testInfo.toString());
		assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
	}

}
