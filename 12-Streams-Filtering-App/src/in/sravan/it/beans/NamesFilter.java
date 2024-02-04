package in.sravan.it.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesFilter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Anushka");
		list.add("Trisha");
		list.add("Nayantara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Anupama Parameswaran");
		list.add("Amisha Patel");

		Stream<String> stream = list.stream();
		
		/*Stream<String> filteredStream = stream.filter(name -> name.startsWith("A"));
		filteredStream.forEach(System.out::println);*/
		
		stream.filter(name -> name.startsWith("A"))
			.forEach(System.out::println);

	}
}
