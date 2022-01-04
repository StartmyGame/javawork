package work3;
import java.util.Scanner;
public class prb03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		double x,y;
		x=cin.nextDouble();
		y=cin.nextDouble();
		if(Math.abs(y)<2.5&&Math.abs(x)<5) {
			System.out.print("在矩形内");
		}
		else {
			System.out.print("在矩形外");
		}
	}

}
