package in.sravanit.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApproachTwo {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Nick", "nick@ashokoit.in");
		Person p2 = new Person(102, "Orlen", "orlen@ashokoit.in");
		Person p3 = new Person(103, "John", "john@ashokoit.in");
		Person p4 = new Person(104, "Charles", "charles@ashokoit.in");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		System.out.println("======== Object Before Sorting ===========");

		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println("======== Object After Sorting ===========");

		//Sorting logic
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getPname().compareTo(p2.getPname());
			}
		});
		
		for (Person p : persons) {
			System.out.println(p);
		}

	}

}
