import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JunitTests {

	@Test
	public void assertException() {
		int[] testArray = {123};
		Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> System.out.println(testArray[1]));
		assertEquals("Index 1 out of bounds for length 1", exception.getMessage());
	}

	@Tag("ci")
	@RepeatedTest(3)
	void repeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println(String.format("%s: Executing repeated test %s",repetitionInfo.getCurrentRepetition(),testInfo.toString()));
		assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
	}

}
