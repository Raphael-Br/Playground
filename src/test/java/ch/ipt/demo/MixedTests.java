package ch.ipt.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.source.util.DocTrees;
import jdk.javadoc.doclet.DocletEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import ch.ipt.demo.streams.Person;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j

class MixedTests {

	@Test
	void mutableArrayList() {
		ArrayList<String> myArrayList = new ArrayList<>(List.of("a", "b"));
		myArrayList.add("c");
		System.out.println(myArrayList);
		assertEquals(3, myArrayList.size());
	}

	@Test
	void ComparatorTest() {
		ArrayList<String> myList = new ArrayList<>(List.of("B", "A", "Z", "G"));
		System.out.println(myList);

		myList.sort(Comparator.naturalOrder());
		System.out.println(myList);

		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);

		myList.sort(Comparator.comparing(String::toString));
		System.out.println(myList);
	}

	@Test
	void stringFormatTest() {
		log.info(String.format("String: %s", "Test")); // String
		log.info(String.format("Character: %c", 'c')); // Char
		log.info(String.format("Integer: %d", 101)); // Integer
		log.info(String.format("Integer: %10d", 101)); // Integer with length
		log.info(String.format("Integer: %010d", 101)); // Integer with lenght, filled up with 0s
		log.info(String.format("Float: %f", 101.00)); // Float
		log.info(String.format("Hexadecimal: %x", 101)); // Hexadecimal

		// % Escape
		log.info(String.format("SELECT IDENTIFIER FROM %%SICS%%.BUSINESS WHERE FORMER_IDENTIFIER = '%s'", "myTest"));

		// PrintF
		System.out.printf("Prints a %s string", "formatted");
	}


	@Test
	void stringTest() {
		String test = "Hello";
		assertTrue(test.toLowerCase().startsWith("he"));
	}

	@Test
	void base64Test() {
		String input = "Hallo Welt!";
		System.out.println(input);

		String stringEncoded = Base64.getUrlEncoder().encodeToString(input.getBytes());
		System.out.println(stringEncoded);

		byte[] actualByte = Base64.getUrlDecoder().decode(stringEncoded);
		String stringDecoded = new String(actualByte);
		System.out.println(stringDecoded);
	}

	@Test
	void uuidTest() {
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
		myList.forEach(System.out::println);
	}

	@Test
	void daysBetweenTest() {
		ZonedDateTime oldPeriodTo = ZonedDateTime.of(2022, 1, 31, 23, 59, 59, 0, ZoneId.of("GMT"));
		ZonedDateTime newPeriodFrom = ZonedDateTime.of(2022, 2, 1, 0, 0, 0, 0, ZoneId.of("GMT"));
		System.out.println(DAYS.between(oldPeriodTo, newPeriodFrom));
	}

}
