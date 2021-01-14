package HW2;

import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		//Scanner for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number please: ");
		int num = input.nextInt();
		System.out.println("The number of zeroes is " + binnum(num));
	}
	
	public static int binnum(int num) {
		//set base case
		if (num == 0) {
			return 1;
		}
		if (num == 1) {
			return 0;
		}
		//recursive call based on remainder
		if (num % 2 != 0) {
			return binnum(num/2);
		}
		else {
			return binnum(num/2) + 1;
		}	
	}
}
