package ch.ipt.demo.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

class GenericsTest {

	@Test
	void genericsPrintTest() {
		GenericsExample.print(1);
		GenericsExample.print(2L);
		GenericsExample.print("3");
	}

	@Test
	void genericsArrayToListTest() {
		String[] myArray = {"1", "2", "3"};
		List<String> myList = GenericsExample.arrayToList(myArray);
		System.out.println(myList);
	}

}
