import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		
		System.out.println("Please enter your brith year;");
		
		Scanner input = new Scanner (System.in); 
		int value = input.nextInt();
		String x = "Your zodiac sign is;";
		
		switch (value % 12) {
		case 0: System.out.println(x+" Monkey "); break;
		case 1: System.out.println(x+" Rooster"); break;
		case 2: System.out.println(x+" Dog"); break;
		case 3: System.out.println(x+" Pig"); break;
		case 4: System.out.println(x+" Rat"); break;
		case 5: System.out.println(x+" Ox"); break;
		case 6: System.out.println(x+" Tiger"); break;
		case 7: System.out.println(x+" Rabbit"); break;
		case 8: System.out.println(x+" Dragon"); break;
		case 9: System.out.println(x+" Snake"); break;
		case 10: System.out.println(x+" Horse"); break;
		case 11: System.out.println(x+" Sheep"); break;
		}
	}

}
