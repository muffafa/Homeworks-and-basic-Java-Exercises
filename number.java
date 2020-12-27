import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		
		int x = (int) (Math.random() * 100); //0-99 
		
		//System.out.println("Number is; "+ x ); 
		
		System.out.println("Enter a number between 0-99(inclusive):");
		
		Scanner input = new Scanner (System.in); 
		int value = input.nextInt(); 
		
		if(value>100 || value<0 ){
			System.out.println("Please enter vaild number 0-99(inclusive)");
		}else if(value == x) {
			System.out.println("You won 10000 Tl!");
		}else if(value %10 == ((x-(x %10))/10) && x %10 == ((value-(value %10))/10) ) {
			System.out.println("You won 5000 Tl!");
		}else if(value %10 == x %10 || ((x-(x %10))/10) == ((value-(value %10))/10) ) {
			System.out.println("You won 1000 Tl!");
		}else {
			System.out.println("You lose.");
		}
		System.out.print("Number was; "+ x);
	}
}
