package in.sravanit.beans;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("India", "USA", "UK", "China", "India", "USA");
		
		//Getting unique values from collection using distinct ( )
		 countries.stream()
					.distinct()
					.forEach(System.out::println);
		
		//Getting specific no. of elements from collection using limit ()
		countries.stream()
				.limit(3)
				.forEach(System.out::println);
		
		//Removing first N no. of elements from collection using skip ()
		countries.stream()
				.skip(3)
				.forEach(System.out::println);
	}
}
