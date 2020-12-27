import java.util.Scanner;
public class nlc {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Number of rows? ");
	    int numberOfLines = in.nextInt();

	    if (numberOfLines >= 1) {
	        int totalWidth = 0;
	        // add up the widths of the numbers themselves
	        for (int number = 1; number <= numberOfLines; number++) {
	            totalWidth = totalWidth + ("" + number).length();
	        }
	        // add in the spaces in-between the numbers
	        totalWidth = totalWidth + (numberOfLines - 1);

	        // now generate each row by counting backwards from the current row number
	        for (int rowNumber = 1; rowNumber<=numberOfLines; rowNumber++) {
	            String row = "";
	            for (int i=rowNumber; i>=2; i--) {
	                row = row + i + " ";
	            }        
	            row = row + "1";

	            // prepend the spaces in front to make it as wide as the last row
	            int paddingLength = totalWidth - row.length();
	            for(int i=1; i<=paddingLength; i++) {
	                row = " " + row;
	            }

	            // output the row
	            System.out.println(row);
	        } 
	    }
	    else {
	        System.out.println("Number of rows must be positive!");
	    }
	}
}
