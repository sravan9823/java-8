import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestApp {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks"); 

// The lambda expression passed to 
// reduce() method takes two Strings 
// and returns the longer String. 
// The result of the reduce() method is 
// an Optional because the list on which 
// reduce() is called may be empty. 
Optional<String> longestString = words.stream() 
        .reduce((word1, word2) 
  -> word1.length() > word2.length() 
                ? word1 : word2); 

// Displaying the longest String 
longestString.ifPresent(System.out::println); 

		FinaninalData fd1 = new FinaninalData("1223", "lItem1", 400d);
		FinaninalData fd2 = new FinaninalData("1223", "lItem2", 300d);
		FinaninalData fd3 = new FinaninalData("1222", "lItem1", 200d);
		FinaninalData fd4 = new FinaninalData("1221", "lItem1", 100d);

		List<FinaninalData> finaninalDataList = Arrays.asList(fd1, fd2, fd3, fd4);

		System.out.println(finaninalDataList);

		Map<String, Map> map = new HashMap<>();

		for (FinaninalData fd : finaninalDataList) {
			HashMap<String, Double> hashMap = new HashMap<String, Double>();
			hashMap.put(fd.getLineItem(), fd.getLineItemAmount());

			if (!map.containsKey(fd.getMonthYear())) {

			} else {
				map.put(fd.getMonthYear(), hashMap);
			}

		}


		String str = "Hello Manash";
	    Map<Character,Long> hm = str.chars().mapToObj(c-> 
	    (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	    System.out.println(hm);
	}

}

class FinaninalData {

	private String monthYear;
	private String lineItem;
	private Double lineItemAmount;

	public FinaninalData(String monthYear, String lineItem, Double lineItemAmount) {
		this.monthYear = monthYear;
		this.lineItem = lineItem;
		this.lineItemAmount = lineItemAmount;
	}

	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public String getLineItem() {
		return lineItem;
	}

	public void setLineItem(String lineItem) {
		this.lineItem = lineItem;
	}

	public Double getLineItemAmount() {
		return lineItemAmount;
	}

	public void setLineItemAmount(Double lineItemAmount) {
		this.lineItemAmount = lineItemAmount;
	}

	@Override
	public String toString() {
		return "FinaninalData [monthYear=" + monthYear + ", lineItem=" + lineItem + ", lineItemAmount=" + lineItemAmount
				+ "]";
	}

}
