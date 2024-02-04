package in.sravanit.beans;

import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {

		Consumer<String> conusmer = (s) -> System.out.println(s);
		// Consumer<String> conusmer = (s) -> System.out::println(s);
		conusmer.accept("Hello");
		int a=5,b=6,c=a=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
