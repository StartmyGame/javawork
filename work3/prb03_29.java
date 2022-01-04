package work3;
import java.util.Scanner;
public class prb03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		double x1,y1,r1,x2,y2,r2;
		x1=cin.nextDouble();
		y1=cin.nextDouble();
		r1=cin.nextDouble();
		x2=cin.nextDouble();
		y2=cin.nextDouble();
		r2=cin.nextDouble();
		double h=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(h<r1+r2) {
			System.out.print("两圆相交");
		}
		else if(h==r1+r2){
			System.out.print("两圆相切");
		}
		else if(h+Math.min(r1,r2)<Math.max(r1, r2)) {
			
		}
	}

}
