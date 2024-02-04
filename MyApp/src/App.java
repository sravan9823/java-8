
public class App {

	public static void main(String[] args) {

		MyInteface mi =() -> System.out.println("Hello");
		mi.m1();

	}

}

@FunctionalInterface
interface MyInteface{
	public void m1();
}


