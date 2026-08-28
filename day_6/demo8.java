package day_6;

public class demo8 {
	public static void main(String[] args) {
		String[] names1 = {"Alice", "Bob", "Charlie"};
		String[] names2 = {"David", "Emma"};

	    String[] merged = new String[names1.length + names2.length];

	    int index = 0;

	   
	    for (int i = 0; i < names1.length; i++) {
	    	merged[index++] = names1[i];
	        }

	       
	        for (int i = 0; i < names2.length; i++) {
	        	merged[index++] = names2[i];
	        }

	        System.out.println("Merged names array:");
	        for (String name : merged) {
	            System.out.println(name);
	        }
	    }
	}


