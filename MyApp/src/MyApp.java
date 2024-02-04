
public class MyApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "abc", "xyz");
		Employee emp2 = new Employee(100, "abc", "xyz");

		/*
		 * String s ="Java"; String s1 ="Java"; String s2 = new String("Java");
		 * System.out.println(s.hashCode()); System.out.println(s1.hashCode());
		 * System.out.println(s2.hashCode()); System.out.println(s==s1); m1(s);
		 * System.out.println(" -> "+s); m1(s2); System.out.println(s2);
		 */
		
		// key for map should be immutable 
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		Integer i3 = new Integer(30);
		
		
	}

	public static void m1(String s) {
		s = "abc";
	}

	public static void modifiedEmp(Employee emp) {

	}

}

class Employee {

	private Integer id;
	private String firstName;
	private String lastName;

	public Employee(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}

interface int1 {
	void m1();
}

interface int2 {

	void m1();

}

class int3 implements int1, int2 {
	public void m1() {
	}
}