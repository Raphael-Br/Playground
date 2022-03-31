package ch.ipt.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
class SprintReviewDemoTest {

	// Streams Debugging
	// Breakpoints
	@Test
	void streamsDebugging() {
		List<String> myList = List.of("Markus", "HP", "Thomas", "Dominique", "Luca", "Marco", "Raphael");
		List<String> myNewList = myList.stream()
				.map(name -> name + " test")
				.filter(name -> name.startsWith("M"))
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println(myNewList);
	}

	// Inject Language
	@Test
	void editNonJavaStrings() {
		String html = "";
		System.out.println(html);
	}

}
