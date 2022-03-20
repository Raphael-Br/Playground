package ch.ipt.demo.generics;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Alle Generics haben einen Type Parameter in <>, direkt vor dem Return-Type
 */
@Slf4j
public class GenericsExample {

	private GenericsExample() {}

	/**
	 * Transforms an Array of Type T to a List of type T.
	 */
	public static <T> List<T> arrayToList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	public static <T> void print(T a) {
		log.info("%s\n", a);
	}

}
