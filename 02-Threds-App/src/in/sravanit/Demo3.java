package in.sravanit;

public class Demo3 {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 21; i <= 30; i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(runnable);
		t.start();
	}
}
