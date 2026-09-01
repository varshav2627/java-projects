	//lexical search
package day_9;
import java.util.*;

public class demo05 {
	public static void main(String[] args) {
		String[] numbers = {
					"123465",
					"456137",
					"124798",
					"129053",
					"120157"
			};
			String search = "12";
			// find numbers containing "12"
			ArrayList<String> result = new ArrayList<>();
			for (String num : numbers) {
				if (num.contains(search)) {
					result.add(num);
				}
			}
			//sort alphabetically (numerically as strings)
			Collections.sort(result);
			//display result
			System.out.println("search results:");
			for (String num : result) {
				System.out.println(num);
			}
		}

	}


