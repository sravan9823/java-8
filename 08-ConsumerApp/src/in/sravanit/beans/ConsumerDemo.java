package in.sravanit.beans;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> consumer1 = (name) -> System.out.println(name + " Good Morning...!!");
		consumer1.accept("Sravan");

		Consumer<Integer> consumer2 = (num) -> System.out.println(num * num);
		consumer2.accept(10);
	}
}
