import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Number of rows? ");
		int power = in.nextInt();
		int powerOfTwo =  (int) Math.pow(2, power) ;
		int startRight = 0; 
		String padding = "";
		int rowNumber = 0;
			for (int row = 1; row <=  powerOfTwo ; row += row) {
				
				rowNumber += 1;
				
				for(int j = power-rowNumber ; j>=0 ;j--) {
					System.out.printf("%4s",padding);
				}
				for (int i = 1; i <= row; i += i) {
					System.out.printf("%4d", (i));
					startRight = i;
				}
				
				for (int r = startRight/2; r > 0 ; r /= 2 ) {
					System.out.printf("%4d", (r));	
				}
				System.out.println();
							
			}
	}
}

