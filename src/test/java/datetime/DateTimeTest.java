package datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateTimeTest {

	@Test
	public void dateTimeTest() {
		LocalDateTime local = LocalDateTime.of(2020,7,20,13,0,0,0);
		ZonedDateTime zoned = ZonedDateTime.of(2020,7,20,13,0,0,0, ZoneId.of("UTC"));

		System.out.println(local);
		System.out.println(zoned);
		System.out.println(zoned.toLocalDateTime());

		assertEquals(local, zoned.toLocalDateTime());
	}

	@Test
	public void dateTest(){
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		LocalDate ld = LocalDate.parse("01.04.1990", dateTimeFormatter);
		System.out.println(ld);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		ZonedDateTime zdt = ZonedDateTime.parse("1990-04-01 00:00:00 UTC", formatter);
		System.out.println(zdt);
		System.out.println(zdt.toLocalDate());
	}

	@Test
	public void zonedTest(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		ZonedDateTime dateTime = ZonedDateTime.parse("2020-07-14 00:00:00 UTC", formatter);
		System.out.println(dateTime);
	}

	@Test
	public void timezoneZTest() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		ZonedDateTime dateTime = ZonedDateTime.parse("2020-07-14 23:25:00 Z", formatter);
		System.out.println(dateTime);

		ZonedDateTime dateTime2 = ZonedDateTime.parse("2020-07-14T23:25:00Z");
		System.out.println(dateTime2);

		ZonedDateTime now = ZonedDateTime.now();

		LocalDateTime v1 = now.withZoneSameLocal(ZoneId.of("Z")).toLocalDateTime();
		LocalDateTime v2 = now.toLocalDateTime();

		System.out.println(v1);
		System.out.println(v2);

		assertTrue(v1 == v2);
		assertEquals(v1, v2);
	}

}
