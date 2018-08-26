package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring an object
		Employee banu; 
		
		// import is needed only when the class is from a different package
		// new - instantiate a variable; allocating memory for variables
		// Employee() - constructor - used to initializing the object
		// same name as the class
		
		banu = new Employee(); 
		
		banu.salary = 123456;
		banu.bonus = 789654;
		banu.calculateSalary();

		System.out.println("---------------------------");	
		
		Employee banu1 = new Employee(); 
		
		banu1.salary = 123456;
		banu1.bonus = 789654;
		int totalsal = banu1.calculateSalary1();

		System.out.println("Total Salary is :"+ totalsal);
	}

}



