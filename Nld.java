import java.util.Scanner;
public class Nld {
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
	        
	        // now generate each row 
	        for (int rowNumber = numberOfLines; rowNumber>=1; rowNumber--) {
	            String row = "1";
	            for (int i=2; i<=rowNumber; i++) {
	                row = row + " " + i;
	            }        
	           

	            // padding
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
