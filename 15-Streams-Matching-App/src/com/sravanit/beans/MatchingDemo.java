package com.sravanit.beans;

import java.util.Arrays;
import java.util.List;

public class MatchingDemo {

	public static void main(String[] args) {

		Person p1 = new Person("David", 23, "India");
		Person p2 = new Person("Joy", 25, "USA");
		Person p3 = new Person("Ryan", 50, "Canada");
		Person p4 = new Person("Ram", 45, "India");
		Person p5 = new Person("Ching", 56, "China");

		List<Person> list = Arrays.asList(p1, p2, p3, p4, p5);

		boolean isIndiansAvailable = list.stream().anyMatch(p -> p.getCountry().equals("India"));
		System.out.println("Is Indians available in the collect :: " + isIndiansAvailable);

		boolean allMatch = list.stream().allMatch(p -> p.getCountry().equals("India"));
		System.out.println("All persons Indians or not :: " + allMatch);

		boolean noneMatch = list.stream().noneMatch(p -> p.getCountry().equals("Germany"));

		System.out.println("No Germans available :: " + noneMatch);
	}
}

class Person {
	private String name;
	private int age;
	private String country;

	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
