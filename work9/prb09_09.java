package work9;

import javawk1.copy9_08;

public class prb09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy9_08 myCircle=new copy9_08(5.0);
		System.out.println("the area of the circlr of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("the area of the circlr of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		System.out.println("the number of objects created is "+copy9_08.getNumberOfObjects());
	}

}
