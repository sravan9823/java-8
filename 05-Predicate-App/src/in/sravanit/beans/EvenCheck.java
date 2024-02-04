package in.sravanit.beans;

import java.util.function.Predicate;

public class EvenCheck {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (i) -> i % 2 == 0;
		System.out.println(predicate.test(10));

		Predicate<Integer> predicate2 = predicate.negate();
		System.out.println(predicate2.test(10));
	}

}
