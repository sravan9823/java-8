package in.sravanit.beans;

import java.util.ArrayList;
import java.util.List;

public class FilteringMappingDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Anushka");
		list.add("Trisha");
		list.add("Nayantara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Anupama Parameswaran");
		list.add("Amisha Patel");

		list.stream()
			.filter(name -> name.startsWith("A"))
			.mapToInt(name -> name.length())
			.forEach(System.out::println);
	}

}
