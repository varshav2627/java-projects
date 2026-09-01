//lexical search

package day_9;
import java.util.*;

public class demo04 {
	public static void main(String[]args) {
		String[]names= {
				"Ravi",
				"Rahul",
				"Anand",
				"Rakesh","Raj"
		};
		String search ="Ra";
		// find names containing "Ra"
		ArrayList<String>result=new ArrayList<>();
		for(String name:names) {
			if(name.contains(search)) {
				result.add(name);
			}
		}
		//sort alphabetically
		//display result
		System.out.println("search results:");
		for(String name:result) {
			System.out.println(name);
		}
	}

}
