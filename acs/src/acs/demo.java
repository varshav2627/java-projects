package acs;
class Grandparent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends Grandparent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}


public class demo extends Parent {
	public static void main(String[] args) {
 		demo  bb= new demo();
 		bb.bp();
 		bb.cancer();
	}

}
