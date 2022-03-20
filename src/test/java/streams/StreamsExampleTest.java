package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static streams.StreamsExample.filterList;

class StreamsExampleTest {

	@Test
	public void myTest() {
		List<Person> fullList = Arrays.asList(
				new Person("Raphael", 38),
				new Person("Sarah", 22),
				new Person("Daniel", 64),
				new Person("Pia", 62)
		);

		List<Person> shortlist = filterList(fullList);
		System.out.println(shortlist);
	}

	@Test
	public void arrayToStreamTest() {
		List<Integer> myArr = Arrays.asList(1,2,3,1,5,9);
		myArr.stream()
				.filter(x -> x > 3)
				.forEach(System.out::println);
	}

	@Test
	public void streamTest() {
		Stream<String> myStr = Stream.of("all","ball","c");
		myStr.filter(x -> x.contains("a"))
				.forEach(System.out::println);
	}

}