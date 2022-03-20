package ch.ipt.demo.enumeration;// Class with Enum Constructor

public class EnumInsideClassExample {

	// Enum inside a class
	public enum Month {
		JAN(1),
		FEB(2),
		MRZ(3),
		DEZ(12);

		private final int value;

		// Enum Konstruktor ist private
		Month(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

	}

}
