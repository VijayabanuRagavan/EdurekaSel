package day2;

import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {
		// If a year is a Centuary year -- year must be divisible by 400
		// if a year is a non-centuary year -- year must be divisible by four only

		int year;
		
		System.out.println("Enter the value of year : ");
		Scanner sc = new Scanner (System.in);
		
		year = sc.nextInt();
		
		if ((year % 100 == 0 && year % 400 == 0)||(year % 100 !=0 && year %4 == 0)) {

			System.out.println("Leap Year");

		} else {
			System.out.println("Not a leap Year");
		}

		sc.close();
	}
	

}
