package in.sravanit.beans;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class SoringMapValues {

	public static final boolean ASC = true;
	public static final boolean DESC = false;

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "USA");
		map.put(91, "India");
		map.put(61, "Australia");
		map.put(86, "China");
		map.put(33, "France");
		map.put(852, "Hongkong");
		map.put(92, "Pakistan");

		System.out.println("======== Object Before Sorting ===========");

		System.out.println(map);

		System.out.println("======== Object After Sorting ===========");

		Map<Integer, String> sortedMap = sortByComparator(map, ASC);

		System.out.println(sortedMap);

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(entrySet);

		Collections.sort(list, (obj1, obj2) -> obj1.getKey().compareTo(obj2.getKey()));

		// Maintaining insertion order with the help of LinkedList
		Map<Integer, String> sortedMap1 = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> entry : list) {
			sortedMap1.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap1);

		LinkedHashMap<Integer, String> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("collect " + collect);

	}

	private static Map<Integer, String> sortByComparator(Map<Integer, String> unsortMap, final boolean order) {

		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(unsortMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				if (order) {
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());

				}
			}
		});

		// Maintaining insertion order with the help of LinkedList
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
