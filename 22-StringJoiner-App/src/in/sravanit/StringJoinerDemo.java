package in.sravanit;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		//StringJoiner joiner = new StringJoiner(",");
		StringJoiner joiner = new StringJoiner(",", "{", "}");
		joiner.add("Ramu");
		joiner.add("Sita");
		joiner.add("Raja");
		joiner.add("Rani");

		System.out.println(joiner);
	}
}
