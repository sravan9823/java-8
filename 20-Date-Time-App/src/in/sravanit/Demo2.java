package in.sravanit;

import java.time.LocalTime;

public class Demo2 {

	public static void main(String[] args) {

		// Getting current time
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Getting specific time using of method
		time = LocalTime.of(11, 20, 30);
		System.out.println(time);

		// Converting String value to Time using parse method
		time = LocalTime.parse("08:30:20");
		System.out.println(time);

		// Adding 4 seconds to given time
		time = time.plusSeconds(4);
		System.out.println(time);

		// Adding 10 minutes to given time
		time = time.plusMinutes(10);
		System.out.println(time);

		// Adding hours to given time
		time = time.plusHours(1);
		System.out.println(time);
	}
}
