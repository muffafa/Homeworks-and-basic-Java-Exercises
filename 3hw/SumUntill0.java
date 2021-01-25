import java.util.Scanner;
public class SumUntill0 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int divide = 0, sum = 0;
		int user;
		
		do {
			System.out.println("Enter a number;");
			user = in.nextInt();
			sum += user;
			if(user !=0) divide++;
		}while(user != 0);
		
		if(divide == 0 ) {
			System.out.println("You did not entered any number");
		}else {
		System.out.printf("You entered %d number%nThe avarage of number is= %f", divide, (sum*1.0/divide));
		}
	}
}
