package day2;

public class VariableExample {

	public static void main(String[] args) {
		//main control space enter
		//reserved key words - in purple
		//Short cut to Execute
		//shift+Alt+X and then J
		
		
		int firstNumber; // control spacebar after typing few letters of the word
		int secondNumber = 78;
		
		
		firstNumber = 23; //storing the value 23 in the variable 
		int sum = firstNumber+secondNumber;
		
		System.out.println("First Number :" + firstNumber); //+ concatenates the string and the number value in the variable
		System.out.println("First Number :" + firstNumber+secondNumber); //because there is a string the variables are always concatenated
		
		System.out.println("Sum of two numbers :" + (firstNumber+secondNumber)); //use () to separate mathematical operation and the string
		System.out.println("Sum of two numbers :" + sum); 
		
		byte myFirstByteNum = 70;
		
		System.out.println("Byte Number :" + myFirstByteNum);
		
		System.out.println("Sum of two numbers of different data types:" + (firstNumber+myFirstByteNum));
		
		long longNumber = 5456564565456456l;
		
		float floatVar = 78.904f;
		
		double doubleNum = 4896.321321;
		
		boolean flag = true;
		
		char firstChar = 'B';
		
		//Non-primitive data type - only class name can start with a Capital letter
		//String is a Class and was added later on 
		
		String myStr = "My name is Banu";
		
		System.out.println(myStr);
		
		
		System.out.println(secondNumber++); //post increment
		System.out.println(++secondNumber); //pre increment
		
		System.out.println(secondNumber--); //post decrement
		System.out.println(--secondNumber); //pre decrement
		
	}

}
