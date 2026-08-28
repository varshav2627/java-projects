package day_5;
import java.util.HashSet;

public class demo10 {
	public static void main(String[]args) {
		HashSet<Object> set = new HashSet<>();
		
		set.add("10");
		set.add("20");
		set.add("10");
		set.add("Hello");
		set.add("Hello");
		set.add("3.14");
		set.add("A");
		set.add("null");
		set.add("null");
		set.add("100");
		
		System.out.println("Size of set: \" + set.size()");
        for (Object obj : set) {
            System.out.println(obj);
        }
        
        System.out.println("\nUsing Iterator:");
        java.util.Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            Object val = it.next();
            System.out.println(val);

        }

	}
	

}
