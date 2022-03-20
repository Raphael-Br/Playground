package lombok;

import org.junit.jupiter.api.Test;

class LombokExampleTest {

	@Test
	public void lombokTest() {
		LombokExample lt1 = new LombokExample("Name", "Vorname", 38);
		LombokExample lt2 = new LombokExample("Name", "Vorname", 38, true);
		System.out.println(lt1);
	}

}
