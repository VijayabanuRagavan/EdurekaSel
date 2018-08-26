package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {

		int firstNum, secNum, thirdNum;

		firstNum = 90;
		secNum = 90;
		thirdNum = 90;

		if ((firstNum > secNum) && (firstNum > thirdNum)) {
			System.out.println("First Number is greatest");
		} else if ((secNum > firstNum) && (secNum > thirdNum)) {
			System.out.println("Second Number is greatest");
		} else if ((thirdNum > firstNum) && (thirdNum > secNum)) {
			System.out.println("Third Number is greatest");
		} else if ((firstNum == secNum) && (firstNum > thirdNum)) {
			System.out.println("First and Second are greater than Third");
		} else if ((firstNum == thirdNum) && (firstNum > secNum)) {
			System.out.println("First and Third are greater than second");
		} else if ((secNum == thirdNum) && (secNum > firstNum)) {
			System.out.println("Second and Third are greater than First");
		} else {
			System.out.println("All are equal");
		}

	}
}
