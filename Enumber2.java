import java.util.Scanner;

public class Enumber2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double fact;
		double eNumber = 0;
		int i = in.nextInt();
		
		while(i>0) {
			fact=1;
			for(int j=1; j<=i; j++) {
				fact = fact * j;
			}
			eNumber = eNumber +(1.0/fact);
			i--;
		}
		eNumber = eNumber +1;
		System.out.println(eNumber);
	}

}
