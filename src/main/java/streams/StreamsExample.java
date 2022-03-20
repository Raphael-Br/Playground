package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static List<Person> filterList(List<Person> myContacts) {
		List<Person> myShortlist = myContacts.stream()
				.filter(name -> name.getName().equals("Sarah") || name.getName().equals("Daniel"))
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());

		return myShortlist;
	}

}
