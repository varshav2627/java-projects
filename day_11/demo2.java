package day_11;

class TrieNode {
    TrieNode[] children = new TrieNode[26]; // a-z
    boolean isEndOfWord = false;
}
public class demo2 {
	static TrieNode root = new TrieNode();

    // Insert a word into the Trie
	static void insert(String word) {
		TrieNode current = root;
	    for (char ch : word.toCharArray()) {
	    	int index = ch - 'a';
	        if (current.children[index] == null) {
	        	current.children[index] = new TrieNode();
	            }
	            current = current.children[index];
	        }
	        current.isEndOfWord = true;
	    }

	    // Search a word in the Trie
	    static boolean search(String word) {
	        TrieNode current = root;
	        for (char ch : word.toCharArray()) {
	            int index = ch - 'a';
	            if (current.children[index] == null) {
	                return false;
	            }
	            current = current.children[index];
	        }
	        return current.isEndOfWord;
	    }

	    public static void main(String[] args) {

	        // Insert words with common prefix "ca"
	        insert("cat");
	        insert("car");
	        insert("can");
	        insert("cap");

	        // Search test
	        System.out.println("Search 'cat': " + search("cat")); // true
	        System.out.println("Search 'car': " + search("car")); // true
	        System.out.println("Search 'can': " + search("can")); // true
	        System.out.println("Search 'ca':  " + search("ca"));  // false
	        System.out.println("Search 'cap': " + search("cap")); // false
	    }
	}


