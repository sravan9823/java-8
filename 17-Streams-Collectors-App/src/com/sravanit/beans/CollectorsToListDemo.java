package com.sravanit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ram", 23, 20000);
		Employee e2 = new Employee("Ashok", 25, 30000);
		Employee e3 = new Employee("Suresh", 33, 25000);
		Employee e4 = new Employee("Charan", 26, 40000);

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4);
		
		List<String> namesList = employees.stream()
					.map(emp -> emp.getName())
					.collect(Collectors.toList());
		
		System.out.println(namesList);

	}

}

class Employee {

	String name;
	int age;
	int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}