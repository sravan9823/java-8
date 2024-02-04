package in.sravanit.beans;

import java.util.function.Predicate;

public class NamesPrinting {

	public static void main(String[] args) {

		String[] names = { "Kajal", "Samatha", "Anushka", "Trisha", "Anupama", "Nayanthara", "Aishwarya" };

		Predicate<String> predicate = (name) -> name.startsWith("A");

		for (String name : names) {
			if (predicate.test(name)) {
				System.out.println(name);
			}
		}

	}

}
