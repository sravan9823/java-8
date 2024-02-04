package in.sravanit.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import in.sravanit.Employee;

public class EmployeeService {

	private Map<Integer, Employee> empMap = new HashMap<>();

	/*public Employee getEmpById(Integer empId) {
		return empMap.get(empId);
	}*/
	
	public Optional<Employee> getEmpById(Integer empId) {
		return Optional.ofNullable(empMap.get(empId));
	}
}
