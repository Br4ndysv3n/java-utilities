package de.br4ndysv3n.utils;

import de.br4ndysv3n.utils.string.FormattingTuple;
import de.br4ndysv3n.utils.string.MessageFormatter;

public class StringUtils {

	/**
	 * Formatiert eine Zeichenkette. das zu ersetzende Argument wird in {@see format} mit geschweiften Klammern angegeben.
	 * Beispiel:
	 *
	 * String.format("%s", "Hello World 123") wird zu
	 * StringUtils.format("{}", "Hello World 123")
	 *
	 * Damit ist auch Typsicherheit gewährleistet.
	 *
	 * @param format Der zu formatierende String.
	 * @param argument Das Argument, das im String ersetzt werden soll.
	 * @return Der String mit dem ersetzten Argument.
	 */
	public static String format(String format, Object argument) {
		final FormattingTuple formattingTuple = MessageFormatter.format(format, argument);
		return formattingTuple.getMessage();
	}

	/**
	 * Formatiert eine Zeichenkette. Jedes zu ersetzende Argument wird in {@see format} mit geschweiften Klammern angegeben.
	 * Beispiel:
	 *
	 * String.format("%s %s %d", "Hello", "World", 123) wird zu
	 * StringUtils.format("{} {} {}", "Hello", "World", 123)
	 *
	 * Damit ist auch Typsicherheit gewährleistet.	 *
	 *
	 * @param format Der zu formatierende String.
	 * @param arguments Die Argumente, die im String ersetzt werden sollen.
	 * @return Der String mit den ersetzten Argumenten.
	 */
	public static String format(String format, Object... arguments) {
		final FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, arguments);
		return formattingTuple.getMessage();
	}

	/**
	 * Liefert ein Kennzeichen, ob der übergebene String {@see null} oder leer ist.
	 *
	 * @param str Der zu prüfende String.
	 * @return true, wenn der String null oder leer ist, andernfalls false.
	 */
	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}
}
