package work3;
import java.util.Scanner;
public class prb03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		System.out.print("请输入前九位数字:");
		int sum=0;
		String k=null;
		k=cin.nextLine();
		for(int i=0;i<9;i++) {
			sum+=(k.charAt(i)-48)*(i+1);
		}
		sum%=11;
		System.out.print("ISBN-10的数字是:"+k);
		if(sum==10) {
			System.out.print("X");
		}
		else {
			System.out.print(sum);
		}
	}

}
