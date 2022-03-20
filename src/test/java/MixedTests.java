import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import streams.Person;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j

class MixedTests {

	// Streams Debugging
	// Breakpoints
	@Test
	public void streamsDebugging() {
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
	public void editNonJavaStrings() {
		String html = "";
		System.out.println(html);
	}

	@Test
	public void mutableArrayList() {
		ArrayList<String> myArrayList = new ArrayList<>(List.of("a", "b"));
		myArrayList.add("c");
		System.out.println(myArrayList);
		assertEquals(3, myArrayList.size());
	}

	@Test
	public void stringFormatTest() {
		log.info(String.format("String: %s", "Test")); // String
		log.info(String.format("Character: %c", 'c')); // Char
		log.info(String.format("Integer: %d", 101)); // Integer
		log.info(String.format("Integer: %10d", 101)); // Integer with length
		log.info(String.format("Integer: %010d", 101)); // Integer with lenght, filled up with 0s
		log.info(String.format("Float: %f", 101.00)); // Float
		log.info(String.format("Hexadecimal: %x", 101)); // Hexadecimal

		log.info(String.format("SELECT IDENTIFIER FROM %%SICS%%.BUSINESS WHERE FORMER_IDENTIFIER = '%s'", "myTest")); // % Escape
	}

	@Test
	public void base64Test() {
		String input = "Hallo Welt!";
		System.out.println(input);

		String stringEncoded = Base64.getUrlEncoder().encodeToString(input.getBytes());
		System.out.println(stringEncoded);

		byte[] actualByte = Base64.getUrlDecoder().decode(stringEncoded);
		String stringDecoded = new String(actualByte);
		System.out.println(stringDecoded);
	}

	@Test
	public void uuidTest() {
		UUID uuid = UUID.randomUUID();
		System.out.println("UUID: " + uuid);
		System.out.println("Type: " + uuid.getClass().getSimpleName());
	}

	@Test
	void loggerTest() {
		System.out.println("Reihenfolge: trace > debug > info > warn > error");
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
	}

	@Test
	void fasterXml() throws JsonProcessingException {
		// https://www.baeldung.com/jackson-xml-serialization-and-deserialization
		Person person = new Person("Raphael", 38);

		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(person);
		System.out.println(xml);
	}

	@Test
	void getClassName() {
		System.out.println(this.getClass().getSimpleName()); // Classname
		System.out.println(this.getClass().getCanonicalName()); // Classname inkl. Paket
	}

	@Test
	void filterTest() {
		List<String> myList = Arrays.asList("123", "123-V15", "456", "456-V15");
		myList.forEach(System.out::println);

		System.out.println("*** AFTER FILTER:");
		myList = myList.stream().filter(e -> e.contains("-V15")).collect(Collectors.toList());
		myList.forEach(e -> System.out.println(e));
	}

	@Test
	void ComparatorTest() {
		List<String> myList = List.of("B", "A", "Z", "G");
		System.out.println(myList);

		myList.sort(Comparator.naturalOrder());
		System.out.println(myList);

		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);

		myList.sort(Comparator.comparing(String::toString));
		System.out.println(myList);
	}

	@Test
	void daysBetweenTest() {
		ZonedDateTime oldPeriodTo = ZonedDateTime.of(2022, 1, 31, 23, 59, 59, 0, ZoneId.of("GMT"));
		ZonedDateTime newPeriodFrom = ZonedDateTime.of(2022, 2, 1, 0, 0, 0, 0, ZoneId.of("GMT"));
		System.out.println(DAYS.between(oldPeriodTo, newPeriodFrom));
	}

}
