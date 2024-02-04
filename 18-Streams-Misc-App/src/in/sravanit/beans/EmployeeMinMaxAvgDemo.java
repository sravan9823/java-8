package in.sravanit.beans;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMinMaxAvgDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ram", 23, 20000);
		Employee e2 = new Employee("Ashok", 25, 30000);
		Employee e3 = new Employee("Suresh", 33, 25000);
		Employee e4 = new Employee("Charan", 26, 40000);

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

		Double avgSalary = employees.stream().collect(Collectors.averagingInt(emp -> emp.getSalary()));
		System.out.println("Employee Avg Salary :: " + avgSalary);

		Optional<Employee> minEmpSalary = employees.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Minimum Salary Emp :: " + minEmpSalary.get());

		Optional<Employee> maxEmpSalary = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Maximum Salary Emp :: " + maxEmpSalary.get());
	}

}
