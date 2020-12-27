import java.util.Scanner;

public class Enumber {
	public static double fact(int a) {
	     if(a <= 1) {
	    	 return 1;
	     }
	     return a * fact(a - 1);
	}
	public static double calculate(int i) {
		double cresult = Math.pow(fact(i), -1);
		if(i == 0 ) {
			return 1;
		}
		
	    return cresult+calculate(i-1);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
	      System.out.println("Enter i value: ");
	      int i = sc.nextInt();
	      double eresult = calculate(i);
	      System.out.println(eresult);
	     
	}
}
