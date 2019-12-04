package de.br4ndysv3n.utils;

import java.util.function.Predicate;

/**
 * Die Klasse stellt statische Erweiterungsmethoden für Auflistungen bereit.
 */
public class ListExtensions {

	/**
	 * Sucht in einer Auflistung das erste Element, das den Suchkriterien entspricht.
	 *
	 * @param list      Die zu durchsuchende Auflistung.
	 * @param predicate Die Methode mit den Suchkriterien.
	 * @param <T>       Der Typ der einzelnen Elemente der Auflistung.
	 * @return Das erste Element der Auflistung, das den Suchkriterien entspricht oder der {@code null}, wenn kein Element den
	 * Suchkriterien entspricht.
	 */
	public static <T> T firstOrDefault(final Iterable<T> list, final Predicate<T> predicate) {
		return firstOrDefault(list, predicate, null);
	}

	/**
	 * Sucht in einer Auflistung das erste Element, das den Suchkriterien entspricht.
	 *
	 * @param list         Die zu durchsuchende Auflistung.
	 * @param predicate    Die Methode mit den Suchkriterien.
	 * @param defaultValue Der Default-Wert, falls kein Element den Suchrkriterien entspricht.
	 * @param <T>          Der Typ der einzelnen Elemente der Auflistung.
	 * @return Das erste Element der Auflistung, das den Suchkriterien entspricht oder der {@code null}, wenn kein Element den
	 * Suchkriterien entspricht.
	 */
	public static <T> T firstOrDefault(final Iterable<T> list, final Predicate<T> predicate, final T defaultValue) {
		for (final T element : list) {
			if (predicate.test(element)) {
				return element;
			}
		}

		return defaultValue;
	}

	/**
	 * Liefert ein Kennzeichen, ob ein Element in einer Auflistung existiert.
	 *
	 * @param list      Die zu durchsuchende Auflistung.
	 * @param predicate Die Methode mit den Suchkriterien.
	 * @param <T>       Der der einzelnen Element der Auflistung.
	 * @return true, falls das ELement in der Auflistung existiert, andernfalls false.
	 */
	public static <T> boolean contains(final Iterable<T> list, final Predicate<T> predicate) {
		return firstOrDefault(list, predicate) != null;
	}
}
