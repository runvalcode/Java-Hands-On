/**
 * FailSafeIterator.java
 *
 * @author Runval Borse
 * @since Jun 30, 2026
 */
package com.java.core;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public static void main(String[] args) {
		List<String> countries = new CopyOnWriteArrayList<>();
		countries.add("India");
		countries.add("Sri-Lanka");
		countries.add("Russia");
		countries.add("Australia");

		// fail safe iterator
		Iterator<String> iterator = countries.iterator();
		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.println(country);
			if (!countries.contains("West-Indies")) {
				countries.add("West-Indies");
			}
		}
		System.out.println(countries);
	}

}
