package in.sravanit;

import java.time.LocalDate;
import java.time.Period;

public class Demo5 {

	public static void main(String[] args) {

		Period period = Period.ofDays(5);
		System.out.println(period.getDays());

		period = Period.ofMonths(3);
		System.out.println(period.getMonths());

		period = Period.ofYears(2);
		System.out.println(period.getYears());

		// Find difference between 2 dates
		Period p = Period.between(LocalDate.parse("1990-01-15"), LocalDate.now());
		System.out.println(p);

	}

}
