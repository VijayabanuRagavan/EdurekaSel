package day3;

public class Employee {

	
	
	int salary ;
	int bonus ; 
	
	//constructor initializing with the assigned values
	public Employee() {
		
		
		System.out.println("Enter Constructor");
		salary = 232;
		bonus = 809;
	}
	
	
	//Method overload - same name with different arguments
	//Employee(int salary, int bonus) - is called the signature
	//Method overload is a form of polymorphism
	
	public Employee(int salary, int bonus) {
		
		this.salary = salary;
		this.bonus = bonus;
		System.out.println("Enter Constructor");
		salary = 232;
		bonus = 809;
	}
	
	void calculateSalary() {
		int totalSalary ;
		
		totalSalary = salary + bonus;
		
		System.out.println("Total Salary is :"+ totalSalary);
	}
	
	int  calculateSalary1() {
		int totalSalary ;
		
		totalSalary = salary + bonus;
		
		return totalSalary;
			
	}
	
	
	int calculateSalary3(int sal , int bon) {
		
		int totalSalary ;
		
		totalSalary = sal + bon;
		
		return totalSalary;
	}
	
	int calculateSalary4(int salary , int bonus) {
		
		int totalSalary ;
		
		totalSalary = this.salary + this.bonus;
		
		return totalSalary;
	}
}
