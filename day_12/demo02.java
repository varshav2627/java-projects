package day_12;

public class demo02 {
	public static void search(String text, String pattern) {
		int n = text.length();
	    int m = pattern.length();

	    // Slide pattern over text
	    for (int i = 0; i <= n - m; i++) {
	    	String sub = text.substring(i, i + m);

	    // Compare hash codes first (simple built-in hash)
	    if (sub.hashCode() == pattern.hashCode()) {
	    	if (sub.equals(pattern)) {
	    		System.out.println("Pattern found at index " + i);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String text = "ABABDABACDABABCABAB";
	        String pattern = "ABABCABAB";

	        search(text, pattern);
	    }
	}


