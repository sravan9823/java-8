package in.sravanit;

import java.util.Optional;

import in.sravanit.service.EmployeeService;

public class Demo {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();

		// Employee employee = service.getEmpById(101);
		Optional<Employee> empById = service.getEmpById(101);
		if (empById.isPresent()) {
			Employee employee = empById.get();
			System.out.println(employee.getName());
		} else {
			System.out.println("With given id no record found");
		}

	}
}
