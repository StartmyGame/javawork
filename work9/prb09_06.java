package work9;

public class prb09_06 {

	double radius;
	static int numberOfObjects=0;
	copy9_06(){
		radius=1;
		numberOfObjects++;
	}
	copy9_06(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}

}
