package de.br4ndysv3n.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

	@Test
	public void format_singleArgument() {
		assertEquals("Text Argument", StringUtils.format("Text {}", "Argument"));
		assertEquals("Text 1", StringUtils.format("Text {}", 1));
	}

	@Test
	public void format_multipleArguments() {
		assertEquals("Text Argument1, Argument2", StringUtils.format("Text {}, {}", "Argument1", "Argument2"));
		assertEquals("Text 1, 2", StringUtils.format("Text {}, {}", 1, 2));
	}

	@Test
	public void format_formatIsNull() {
		assertEquals(null, StringUtils.format(null));
	}

	@Test
	public void format_argumentIsNull() {
		assertEquals("This is {}", StringUtils.format("This is {}", null));
	}

	@Test
	public void format_argumentIsEmptyString() {
		assertEquals("This is ", StringUtils.format("This is {}", ""));
	}

	@Test
	public void isEmpty_emptyString() {
		assertTrue(StringUtils.isEmpty(""));
	}

	@Test
	public void isEmpty_nullString() {
		assertTrue(StringUtils.isEmpty(null));
	}

	@Test
	public void isEmpty_string() {
		assertFalse(StringUtils.isEmpty("foobar"));
	}
}
