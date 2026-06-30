/**
 * FailFastIterator.java
 *
 * @author Runval Borse
 * @since Jun 30, 2026
 */
package com.java.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {
      public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Sri-Lanka");
		countries.add("Russia");
		countries.add("Australia");
		
		// fail fast iterator 
		Iterator<String> iterator = countries.iterator();
		while(iterator.hasNext()) {
			String country = iterator.next();
			System.out.println(country);
			
			// here will throw exception ConcurrentModificationException
			countries.remove("Russia");
		}
		
	}
}
