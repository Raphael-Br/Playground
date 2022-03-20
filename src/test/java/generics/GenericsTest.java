package generics;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GenericsTest {

	@Test
	public void genericsPrintTest() {
		GenericsExample.print(1);
		GenericsExample.print(2L);
		GenericsExample.print("3");
	}

	@Test
	public void genericsArrayToListTest() {
		String[] myArray = {"1", "2", "3"};
		List myList = GenericsExample.arrayToList(myArray);
		System.out.println(myList);
	}

}
