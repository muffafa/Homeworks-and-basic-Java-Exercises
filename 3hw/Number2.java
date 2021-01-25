import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int right=3;
		int random= (int) (1+ Math.random()*100);
		//code control
		//System.out.println(random);
		do{
		System.out.println("Enter your guess");
		int user = in.nextInt();
		right = right-1;
			if(random==user) {
				System.out.println("You are right");
				break;
			}else if(random<user) {
				System.out.println("decrease your guess");
				System.out.println("");
				continue;}
			else{
				System.out.println("increase your guess");
				System.out.println("");
				continue;
			}
		}while(right!=0);
		System.out.println("number was"+ random);
	}
}
