package de.br4ndysv3n.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListExtensionsTests {

	@Test
	public void getFirstOrDefaultFromList_listContainsElement() {
		final List<TestElement> testElements = new ArrayList<>();
		testElements.add(new TestElement(1, "element 1"));
		testElements.add(new TestElement(2, "element 2"));
		testElements.add(new TestElement(3, "element 3"));

		final TestElement secondElement = ListExtensions.firstOrDefault(testElements, element -> element.getId() == 2);
		assertEquals(2, secondElement.getId());
		assertEquals("element 2", secondElement.getValue());
	}

	@Test
	public void getFirstOrDefaultFromList_listDoesntContainElement() {
		final List<TestElement> testElements = new ArrayList<>();
		testElements.add(new TestElement(1, "element 1"));

		final TestElement secondElement = ListExtensions.firstOrDefault(testElements, element -> element.getId() == 2);
		assertEquals(null, secondElement);
	}

	@Test
	public void getContains_listContainsElement() {
		final List<TestElement> testElements = new ArrayList<>();
		testElements.add(new TestElement(1, "element 1"));
		testElements.add(new TestElement(2, "element 2"));
		testElements.add(new TestElement(3, "element 3"));

		final boolean contains = ListExtensions.contains(testElements, element -> element.getValue().equals("element 2"));
		assertTrue(contains);
	}

	@Test
	public void getContains_listDoesntContainElement() {
		final List<TestElement> testElements = new ArrayList<>();
		testElements.add(new TestElement(1, "element 1"));

		final boolean contains = ListExtensions.contains(testElements, element -> element.getValue().equals("element 2"));
		assertFalse(contains);
	}


	private class TestElement {
		private final int id;
		private final String value;

		TestElement(final int id, final String value) {
			this.id = id;
			this.value = value;
		}

		int getId() {
			return this.id;
		}

		String getValue() {
			return this.value;
		}
	}
}
