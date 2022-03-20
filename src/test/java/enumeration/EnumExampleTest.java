package enumeration;

import org.junit.jupiter.api.Test;

class EnumExampleTest {

	@Test
	public void enumInsideClassTest() {
		System.out.println(EnumInsideClassExample.Month.Dez);
		System.out.println(EnumInsideClassExample.Month.Dez.name());
		System.out.println(EnumInsideClassExample.Month.Dez.getValue());

		EnumInsideClassExample.Month e = EnumInsideClassExample.Month.Dez;
		System.out.println(e + ", " + e.getValue());
	}

	@Test
	public void separateEnumClassTest() {
		System.out.println(EnumClassMonth.Dez);
	}

}