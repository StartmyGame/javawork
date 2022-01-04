package work9;

import javawk1.copy9_08;

public class prb09_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy9_08[] circleArray;
		circleArray=createCircleArray();
	}
	public static copy9_08[] createCircleArray() {
		copy9_08[] circleArray=new copy9_08[5];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new copy9_08(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(copy9_08[] circleArray) {
		System.out.printf("%-30s%-15s\n", "radius","area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("---------------------------------------------------");
		System.out.printf("%-30s%-15f\n","the total area of circles is",sum(circleArray));
	}
	public static double sum(copy9_08[] circleArray) {
		double sum=0;
		for(int i=0;i<circleArray.length;i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}

}
