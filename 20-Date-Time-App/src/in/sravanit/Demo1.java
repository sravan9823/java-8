package in.sravanit;

import java.time.LocalDate;
import java.time.Month;

public class Demo1 {

	public static void main(String[] args) {

		// Getting Current Date
		LocalDate now = LocalDate.now();
		System.out.println(now);

		// Getting specific date using of method
		LocalDate date = LocalDate.of(1990, 01, 15);
		System.out.println(date);

		date = LocalDate.of(2024, Month.MARCH, 04);
		System.out.println(date);

		// Converting String to Date using parse
		date = LocalDate.parse("2024-02-15");
		System.out.println(date);

		// Adding 4 days to given date
		date = date.plusDays(4);
		System.out.println(date);

		// Adding 4 months to given date
		date = date.plusMonths(4);
		System.out.println(date);

		// check date is before given date
		boolean isBefore = LocalDate.parse("2020-03-12").isBefore(LocalDate.parse("2018-06-14"));
		System.out.println(isBefore);

		// check date is after given date
		boolean isAfter = LocalDate.parse("2020-03-12").isAfter(LocalDate.parse("2018-06-14"));
		System.out.println(isAfter);

	}

}
