package in.sravanit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class Demo {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Hyd", "Banglore", "Pune", "Delhi");

		/*
		 * Iterator<String> iterator = cities.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */

		cities.spliterator().forEachRemaining(name -> System.out.println(name));
		cities.spliterator().forEachRemaining(System.out::println);

	}

}
