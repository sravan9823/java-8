package com.sravanit.beans;

public class WellWisher {

	/*public static void wish(Greeting greeting) {
		greeting.greet();
	}*/

	public static void main(String[] args) {
		
		Greeting hindi = () -> System.out.println("Namskar.....");
		hindi.greet();
		
		Greeting english = () -> System.out.println("Hello Good Morning..!!");
		english.greet();

		/*wish(() -> System.out.println("Hello Good Morning..!!"));*/

		/*wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello Good Morning..!!");
			}
		});
		
		wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Namskar.....");
			}
		});*/
		
		/*Greeting hindiGreeting = new HindiGreeting();
		wish(hindiGreeting);
	
		Greeting englisGreeting = new EnglishGreeting();
		wish(englisGreeting);*/

	}
}
