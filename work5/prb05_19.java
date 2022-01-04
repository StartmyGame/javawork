package work5;

public class prb05_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 7; i++) { 
			for (int j = 1; j <= 15; j++) { 
				if (j >= 8 - i && j <= 8 + i) { 
					System.out.printf("%4d",(int)Math.pow(2, i - Math.abs(8 - j))); 
				}
				else{
					System.out.print(" "); 
				} 
			}
			System.out.println(""); 
		}
	}

}
