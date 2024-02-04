package in.sravanit.beans;

import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		System.out.println("************* Serial Stream *******************");
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream1.forEach(num -> System.out.println(num + " :: " + Thread.currentThread().getName()));

		System.out.println("************* Parallel Stream *******************");
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream2.parallel().forEach(num -> System.out.println(num + " :: " + Thread.currentThread().getName()));
	}

}
