package arrays;

import java.util.Scanner;

public class Test {

	static Scanner input = new Scanner(System.in);
	static int[] reordered;
	
	public static void main(String[] args) {
		
		int A[] = new  int[] {2,5,1,4,6,8,3,7};
		int entry = 0;
		int value = 0;
		boolean check = false;
		
		//Set Right or Left 
		do {
			System.out.printf("Choose operation %n1 : Left shifting%n2 : Right shifting%n");
			entry = input.nextInt();
			
			if(entry == 1 || entry ==2) {
			check = false;
			}else check = true;
			
		} while (check);
		
		//Set Value
		do {
			System.out.printf("Choose the number of digits to shift%n");
			value = input.nextInt();
			
			if(value >0) {
				check = false;
				}else check = true;
			
		} while (check);
		
		if(entry == 1) {
			leftShift(A,value);

		}else {
			rightShift(A,value);
		}
	}

	public static void leftShift(int[] original, int shift) {
		reordered  = new int[original.length];
		for(int i=0; i<original.length;i++) {
		     reordered[i] = original[(shift+i)%original.length];
		}
		print(reordered);
		print(original);
	}

	public static void rightShift(int[] original, int shift) {
		reordered  = new int[original.length];
		

		
		for(int i = original.length; i>0 ;i--) {
			
			int digit =((original.length-shift-i))%original.length;
			if(digit<0) {digit+=original.length;
			
			}
		     reordered[original.length-i] = original[digit];
		}
		print(original);
		print(reordered);
		
	}
	
	public static void print(int[] array) {
		for(int i=0; i<= (array.length -1);i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
