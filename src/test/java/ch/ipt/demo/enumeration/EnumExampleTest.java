package ch.ipt.demo.enumeration;

import ch.ipt.demo.enumeration.EnumClassMonth;
import ch.ipt.demo.enumeration.EnumInsideClassExample;
import org.junit.jupiter.api.Test;

class EnumExampleTest {

	@Test
	void enumInsideClassTest() {
		System.out.println(EnumInsideClassExample.Month.DEZ);
		System.out.println(EnumInsideClassExample.Month.DEZ.name());
		System.out.println(EnumInsideClassExample.Month.DEZ.getValue());

		EnumInsideClassExample.Month e = EnumInsideClassExample.Month.DEZ;
		System.out.println(e + ", " + e.getValue());
	}

	@Test
	void separateEnumClassTest() {
		System.out.println(EnumClassMonth.DEZ);
	}

}