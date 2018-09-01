package day2;

public class Employee {

	
	int salary;
	int bonus;
	
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
	
	
}
