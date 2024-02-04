package in.sravan.it.beans;

import java.util.stream.Stream;

public class NumbersFilter {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(4, 8, 12, 6, 7, 11, 24);

		// stream.forEach(num -> System.out.println(num));
		// stream.forEach(System.out::println);

		/*Stream<Integer> filteredStream = stream.filter(num -> num >= 6);
		filteredStream.forEach(num -> System.out.println(num));*/
		
		stream.filter(num -> num>=10)
			.forEach(System.out::println);
	}
}
