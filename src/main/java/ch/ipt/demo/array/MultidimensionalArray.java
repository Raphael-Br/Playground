package ch.ipt.demo.array;

public class MultidimensionalArray {

	private MultidimensionalArray() {throw new IllegalStateException("Utility class");}

	protected static String[][] get2dArray() {
	String[][] myArray = {
			{"0", "0"},
			{"0", "1"},
			{"1", "0"},
			{"-sourcepath", "my custom value"}
	};
	return myArray;
	}

	protected static String getSourcePath(String[][] options) {
		for (String[] opt : options) {
			if (opt[0].equals("-sourcepath")) {
				return opt[1];
			}
		}
		return null;
	}

}
