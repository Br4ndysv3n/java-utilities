package de.br4ndysv3n.utils;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class AssertTests {

	@Test
	public void objIsNull() {
		try {
			Assert.notNull(null, "foobar");
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("foobar", ex.getMessage());
		}
	}
}
