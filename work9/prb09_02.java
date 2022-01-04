package work9;

import javawk1.SimpleCircle;

public class prb09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCircle circle1=new SimpleCircle();
		System.out.println("the area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		SimpleCircle circle2=new SimpleCircle(25);
		System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		SimpleCircle circle3=new SimpleCircle(125);
		System.out.println("the area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		circle2.radius=100;
		System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
	double radius;
	SimpleCirle(){
		radius=1;
	}
	SimpleCircle(double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*radius;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	}

}
