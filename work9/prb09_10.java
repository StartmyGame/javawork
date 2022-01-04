package work9;

import javawk1.copy9_08;

public class prb09_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy9_08 myCircle=new copy9_08(1);
		int n=5;
		printAreas(myCircle,n);
		System.out.println("\n"+"radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
	}
	public static void printAreas(copy9_08 c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}

}
