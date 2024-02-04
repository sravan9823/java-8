package in.sravanit.beans;

public class Test {

	public static void main(String[] args) {

		// MyInterface mi = () -> System.out.println("This is m1() method");
		MyInterface mi = Test::m2;
		mi.m1();
		//m1 method referring m2 now method reference
	}

	public static void m2() {
		System.out.println("This is m2() method ....");
	}
}

@FunctionalInterface
interface MyInterface {

	public void m1();

}
