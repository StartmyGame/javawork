package work3;
import java.util.Scanner;
public class prb03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int a,b;
		char c;
		System.out.print("请输入数据:");
		a=cin.nextInt();
//		c=cin.ne;
//		c=cin.next().charAt(0);
		b=cin.nextInt();
		if(a*a+b*b<=100) {
			System.out.print("在圆内");
		}
		else {
			System.out.print("在圆外");
		}
	}

}
