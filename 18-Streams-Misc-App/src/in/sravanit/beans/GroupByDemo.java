package in.sravanit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {

		User u1 = new User("Ram", 10000, "India");
		User u2 = new User("Anil", 20000, "Canada");
		User u3 = new User("Sunil", 30000, "India");
		User u4 = new User("Orlen", 40000, "Japan");
		User u5 = new User("Cathie", 50000, "UK");
		User u6 = new User("Ching Ching", 10000, "China");

		List<User> users = Arrays.asList(u1, u2, u3, u4, u5, u6);

		Map<String, List<User>> usersCountryMap = users.stream().collect(Collectors.groupingBy(User::getCountry));
		System.out.println(usersCountryMap);

		Map<Integer, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getSalary));
		System.out.println(collect);
	}	

}
