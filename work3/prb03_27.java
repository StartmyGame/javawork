package work3;
import java.util.Scanner;
public class prb03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		double x,y;
		x=cin.nextDouble();
		y=cin.nextDouble();
		if(x>=0&&x<=200) {
			if(y>=0&&y<=-0.5*x+100) {
				System.out.print("在三角形内");
			}
			else {
				System.out.print("在三角形外");
			}
		}
		else {
			System.out.print("在三角形外");
		}
	}

}
