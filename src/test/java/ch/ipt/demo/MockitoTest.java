package ch.ipt.demo;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * <a href="https://www.baeldung.com/mockito-annotations">Baeldung</a>
 * <a href="https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html">Javadoc.io</a>
 */
class MockitoTest {

	@Test
	void verifyTest() {
		List<String> list = mock(List.class);
		when(list.get(anyInt())).thenReturn("my mock value");
		list.get(0);
		list.get(1);

		verify(list).get(0); // ohne 'times' wird nur 1 Aufruf erwartet
		verify(list, atLeast(1)).get(anyInt());
		verify(list, times(2)).get(anyInt());
	}

	@Test
	void argumentMatcherTest() {
		List<String> mockList = mock(List.class);
		mockList.add("one");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mockList).add(captor.capture()); // prüft im default auf times(1)
		assertEquals("one", captor.getValue());
	}

	@Test
	void multiArgumentCaptorTest() {
		List<String> mockList = mock(List.class);
		mockList.add("one");
		mockList.add("two");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mockList, times(2)).add(captor.capture());

		assertAll(
				() -> assertEquals("one", captor.getAllValues().get(0)),
				() -> assertEquals("two", captor.getAllValues().get(1))
		);
	}

}
