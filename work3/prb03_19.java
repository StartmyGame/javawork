package work3;
import java.util.Scanner;
public class prb03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int a,b,c;
		a=cin.nextInt();
		b=cin.nextInt();
		c=cin.nextInt();
		if(a+b>c&&a+c>b&&b+c>a) {
			System.out.println("合法!");
		}
		else {
			System.out.println("不合法!");
		}
	}

}
