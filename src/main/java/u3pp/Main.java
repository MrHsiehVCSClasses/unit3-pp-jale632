package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author YOUR NAME HERE Jaesung Lee
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();

		while (!input.toUpperCase().equals("STOP")) {
			int yearInput = Integer.parseInt(input);
			if (LeapYear.isLeapYear(yearInput))
			{ 
				System.out.println(yearInput + " is a leap year");
			}
			else
			{
				System.out.println(yearInput + " is not a leap year");
			}
			System.out.println("Enter a year (or enter STOP to end): ");
			//YOUR CODE HERE
			input = sc.nextLine();
		}
		//YOUR CODE HERE
		sc.close();
	}
}