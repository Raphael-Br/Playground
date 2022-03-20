package enumeration;// Class with Enum Constructor

public class EnumInsideClassExample {

	// Enum inside a class
	public enum Month {
		Jan(1),
		Feb(2),
		Mrz(3),
		Dez(12);

		private int value;

		// Enum Konstruktor ist private
		private Month(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

	}

}
