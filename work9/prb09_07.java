package work9;

import javawk1.copy9_06;

public class prb09_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before creating objects");
		System.out.println("the number of circle objects is "+copy9_06.numberOfObjects);
		copy9_06 c1=new copy9_06();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of circle objects ("+c1.numberOfObjects+")");
		copy9_06 c2=new copy9_06(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying cl");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2: radius ("+c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");
	}

}
