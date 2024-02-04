package in.sravanit.beans;

import java.util.Arrays;
import java.util.List;

public class MarriagePortal {

	public static void main(String[] args) {

		Person p1 = new Person("Sravan", "Software", 9160989823l);
		Person p2 = new Person("Gopi", "Chef", 8697658968l);
		Person p3 = new Person("Mahesh", "PhotoGrapher", 7888959598l);
		Person p4 = new Person("Sunil", "Driver", 6897869895l);
		Person p5 = new Person("David", "Teacher", 5689897996l);
		Person p6 = new Person("David", "Software", 6032568975l);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

		persons.stream()
				.filter(person -> person.getJob().equals("Software"))
				.map(person -> person.getName()+"::"+ person.getPhno())
				.forEach(System.out::println);
	}

}
