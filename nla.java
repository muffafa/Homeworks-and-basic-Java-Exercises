import java.util.Scanner;

public class nla {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of rows? ");
		int a = in.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}
}
