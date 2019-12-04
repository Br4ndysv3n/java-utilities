package de.br4ndysv3n.utils;

/**
 * Stellt statische Funktionen bereit, um Vorbedingungen sicherzustellen.
 */
public class Assert {

	/**
	 * Überprüft einen Parameter.
	 *
	 * @param obj     Der zu prüfende Parameter.
	 * @param message Die darzustellende Fehlermeldung.
	 * @throws IllegalArgumentException Wird ausgelöst, wenn der Parameter {@code obj} null ist.
	 */
	public static void notNull(Object obj, String message) {
		if (obj == null) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Überprüft einen String.
	 *
	 * @param str     Der zu prüfende String.
	 * @param message Die darzustellende Fehlermeldung.
	 * @throws IllegalArgumentException Wird ausgelöst, wenn der String {@code str} null oder leer ist.
	 */
	public static void notNullOrEmpty(String str, String message) {
		if (str == null || StringUtils.isEmpty(str)) {
			throw new IllegalArgumentException(message);
		}
	}
}
