import java.util.Scanner;

public class nlb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of rows? ");
		int i = in.nextInt();
		for (; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}

}
