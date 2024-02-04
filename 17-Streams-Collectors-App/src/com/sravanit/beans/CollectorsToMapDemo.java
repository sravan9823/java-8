package com.sravanit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMapDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rahul", "Sachin", "Hardik", "Dhoni");

		Map<String, Integer> map = names.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(map);
	}
}
