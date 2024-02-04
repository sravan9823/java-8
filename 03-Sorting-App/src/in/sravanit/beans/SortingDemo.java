package in.sravanit.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(21);
		al.add(32);
		al.add(5);
		al.add(8);

		System.out.println("Elements Before Sorting :: " + al);
		// Approach - 1 (Implementing Comparator Interface )
		Collections.sort(al, new ElementsSortingComparator());
		// Approach - 2 (Anonymous Implementation for Comparator )
		Comparator<Integer> comparator = (obj1, obj2) -> {
			return (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0;
		};
		// Approach - 3 (Using Lambdas)
		Collections.sort(al, comparator);

		System.out.println("Elements After Sorting :: " + al);

	}

}

class ElementsSortingComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer obj1, Integer obj2) {
		if (obj1 > obj2) {
			return 1;
		} else if (obj1 < obj2) {
			return -1;
		} else {
			return 0;
		}
	}

}