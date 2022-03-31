package ch.ipt.demo.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultidimensionalArrayTest {

	@Test
	void multidimArray() {
		String[][] myArray = MultidimensionalArray.get2dArray();
		String returnValue = MultidimensionalArray.getSourcePath(myArray);
		System.out.println(returnValue);
		assertEquals("my custom value", returnValue);
	}

}