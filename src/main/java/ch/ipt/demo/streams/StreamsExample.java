package ch.ipt.demo.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	private StreamsExample() {}

	public static List<Person> filterList(List<Person> myContacts) {
		return myContacts.stream()
				.filter(name -> name.getName().equals("Linda") || name.getName().equals("Daniel"))
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
	}

}
