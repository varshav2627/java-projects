package ece;
class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class Demo extends Grantparents {
	public static void main(String[] args) {
 		Demo  bb= new Demo();
 		bb.bp();
 		bb.cancer();
	}

	private void cancer() {
		// TODO Auto-generated method stub
		
	}

	private void bp() {
		// TODO Auto-generated method stub
		
	}

}
