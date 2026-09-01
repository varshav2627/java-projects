//Huffman coding(the main goal is to reduce the number of bits needed to store or transmit data)
package day_10;

public class demo02 {
	public static void main(String[]args) {
		String message="AAABBCCD";
		System.out.println("Message:"+message);
		
		//count message
		int a=0,b=0,c=0,d=0;
		for(char ch:message.toCharArray()) {
			if(ch=='A')
				a++;
			else if(ch=='B')
				b++;
			else if(ch=='C')
				c++;
			else if(ch=='D')
				d++;
		}
		System.out.println("\nfrequency:");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		System.out.println("C ="+c);
		System.out.println("D ="+d);
	}
	

}
