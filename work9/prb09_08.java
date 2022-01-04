package work9;

public class prb09_08 {

	private double radius=1;
	private static int numberOfObjects=0;
	public copy9_08() {
		numberOfObjects++;
	}
	public copy9_08(double newRadius) {
		radius=newRadius;
		numberOfObjects++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=(newRadius>=0)?newRadius:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
