package work3;
import java.util.Random;
import java.util.Scanner;
public class prb03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Scanner cin=new Scanner(System.in);
		String k=null;
		int[] n=new int[10];
		int sum1=0,sum2=0;
		for(int i=0;i<10;i++) {
			n[i]=0;
		}
		System.out.print("请输出三位整数:");
		k=cin.nextLine();
//		System.out.print(k);
		
		for(int i=0;i<3;i++) {
			int m=rand.nextInt(10);
//			System.out.print(m);
			n[m]++;
			if(m==k.charAt(i)-48) {
				sum1++;
			}
		}
//		System.out.printf("\n%d %d\n",sum1,sum2);
//		System.out.println();
		for(int i=0;i<3;i++) {
			if(n[k.charAt(i)-48]>0) {
				sum2++;
				n[k.charAt(i)-48]--;
			}
		}
//		System.out.printf("%d %d\n",sum1,sum2);
		
		if(sum1==3) {
			System.out.print("10000美元");
		}
		else if(sum2==3) {
			System.out.print("3000美元");
		}
		else if(sum2>0) {
			System.out.print("1000美元");
		}
		else {
			System.out.print("0美元");
		}
	}

}
