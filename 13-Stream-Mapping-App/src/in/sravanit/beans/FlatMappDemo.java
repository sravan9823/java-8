package in.sravanit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMappDemo {

	public static void main(String[] args) {

		List<String> javaCourses = Arrays.asList("Core Java", "Adv Java", "SBMS", "JRTP");
		List<String> uiCourses = Arrays.asList("HTML5", "CSS3", "Angular", "React JS");
		List<String> cloudCourses = Arrays.asList("DevOps", "AWS", "Azure", "GCP");

		List<List<String>> sravanCourses = Arrays.asList(javaCourses, uiCourses, cloudCourses);
		
		Stream<List<String>> stream1 = sravanCourses.stream();
		
		Stream<String> courses = stream1.flatMap(s -> s.stream());
		
		courses.forEach(System.out::println);
		
	}

}


