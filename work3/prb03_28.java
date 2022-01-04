package work3;
import java.util.Scanner;
public class prb03_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		double x1,y1,w1,h1;
		x1=cin.nextDouble();
		y1=cin.nextDouble();
		w1=cin.nextDouble();
		h1=cin.nextDouble();
		double x2,y2,w2,h2;
		x2=cin.nextDouble();
		y2=cin.nextDouble();
		w2=cin.nextDouble();
		h2=cin.nextDouble();
//		System.out.print("1");
		if((x2-w2/2)<(x1+w1/2)&&(x2+w2/2)>(x1-w1/2)) {
			if((y2+h2/2)<(y1+h1/2)&&(y2-h2/2)>(y1-y1/2)) {
				if((x1+w1/2)>(x2+w2/2)) {
					System.out.print("第二个矩形在第一个矩形里面");
				}
				else {
					System.out.print("第一个矩形在第二个里面");
				}
			}
			else if(y2-h2/2>y1+h1/2||y2+h2/2<x1-h1/2) {
				System.out.print("两个矩形相互重叠");
			}
			else {
				System.out.print("两个矩形没有重叠");
			}
		}
		else if(x2+w2/2>x1-w1/2||x2-w2/2<x1+w1/2){
			if((y2+h2/2)<(y1+h1/2)&&(y2-h2/2)>(y1-y1/2)) {
				System.out.print("两个矩形相互重叠");
			}
			else {
				System.out.print("两个矩形没有重叠");
			}
		}
		else {
			System.out.print("两个矩形没有重叠");
		}
	}

}
