package de.br4ndysv3n.utils;

public class StringExtensions {

	/**
	 * Liefert ein Kennzeichen, ob eine Zeichenkette NULL oder leer ist.
	 *
	 * @param s	Die Zeichenkette.
	 * @return true, wenn die Zeichenkette NULL oder leer ist, andernfalls false.
	 */
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}
}
