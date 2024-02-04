package in.sravanit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {

	public static void main(String[] args) {

		Callable callable = () -> {
			for (int i = 100; i < 120; i++) {
				System.out.println(i);
			}
			return null;
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(callable);

		/*Callable callable = new Callable() {
			@Override
			public Object call() throws Exception {
				for(int i=100;i<120;i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				
				return null;
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(callable);*/
	}
}
