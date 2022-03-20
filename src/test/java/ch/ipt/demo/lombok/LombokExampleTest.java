package ch.ipt.demo.lombok;

import ch.ipt.demo.lombok.LombokExample;
import org.junit.jupiter.api.Test;

class LombokExampleTest {

	@Test
	void lombokTest() {
		LombokExample lt1 = new LombokExample("Name", "Vorname", 38);
		LombokExample lt2 = new LombokExample("Name", "Vorname", 38, true);
		System.out.println(lt1);
	}

}
