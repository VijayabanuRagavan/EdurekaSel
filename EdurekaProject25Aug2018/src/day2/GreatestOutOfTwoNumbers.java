package day2;

public class GreatestOutOfTwoNumbers {

	public static void main(String[] args) {

		int firstNum, secondNum;
		firstNum = 98;
		secondNum = 34;

		//shift+control+B : adds/removes breakpoint
		//f5-step inot ; f6 -step over; f8 - execute till next BPT
		if (firstNum > secondNum) {
			System.out.println("First Number is greatest");
		}
		else if (firstNum == secondNum) {
			System.out.println("Both are equal");
		}

		else if (secondNum > firstNum) {
			System.out.println("Second Number is greatest");
		}

	}

}
