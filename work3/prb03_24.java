package work3;
import java.util.Random;
public class prb03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		String[] k1=new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] k2=new String[] {"Clubs","Diamonds","Hearts","Spades"};
		int x,y;
		x=rand.nextInt(13);
		y=rand.nextInt(4);
		System.out.print("The card you picked is "+k1[x]+" of "+k2[y]);
	}

}
