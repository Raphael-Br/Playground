package ch.ipt.demo.streams.queue;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class MyQueueTest {

	@Test
	void priorityQueue() {
		Queue<String> queue = new PriorityQueue<>();

		// Add: if queue is full, throws exception
		queue.add("1");
		queue.add("2");

		// Offer: if queue is full, 'false' is returned
		queue.offer("3");
		System.out.printf("Queue: %s", queue);

		// Poll: returns null, if queue is empty
		System.out.printf("\n\nPoll: %s", queue.poll());
		System.out.printf("\nAfter Poll: %s", queue);

		// Remove: throws exception, if queue is empty
		System.out.printf("\n\nRemove: %s", queue.remove());
		System.out.printf("\nAfter Remove: %s", queue);

		// Peek: returns first element without removing it. returns 'null' if queue is empty
		System.out.printf("\n\nPeek: %s", queue.peek());

		// Element: as element, but throws NoSuchElementException if queue is empty
		System.out.printf("\nElement: %s", queue.element());

		System.out.printf("\n\nQueue contains 3: %s", queue.contains("3"));
		System.out.printf("\nQueue size: %s", queue.size());
		queue.clear();
	}

	@Test
	void linkedListQueue() {
		Queue<String> queue = new LinkedList<>();
		queue.add("1");
		queue.add("2");
		queue.add("3");

		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(queue.poll());
		}
	}

}
