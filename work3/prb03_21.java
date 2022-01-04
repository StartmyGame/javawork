package work3;
import java.util.Scanner;
public class prb03_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int y,m,d;
		System.out.print("year:");
		y=cin.nextInt();
		System.out.print("mouth:");
		m=cin.nextInt();
		System.out.print("day:");
		d=cin.nextInt();
		if(m<=2) {
			m+=12;
			y--;
		}
		int j=y/100,k=y%100;
		int h=(d+(26*(m+1)/10)+k+k/4+j/4+5*j)%7;
		if(h==0) {
			System.out.print("星期六");
		}
		else if(h==1) {
			System.out.print("星期天");
		}
		else if(h==2) {
			System.out.print("星期一");
		}
		else if(h==3) {
			System.out.print("星期二");
		}
		else if(h==4) {
			System.out.print("星期三");
		}
		else if(h==5) {
			System.out.print("星期四");
		}
		else {
			System.out.print("星期五");
		}
	}

}
