package day3;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee banu = new Employee();
		
		int banusal = banu.calculateSalary3(2000, 5000);
		
		System.out.println("Day3 Salalry:"+ banusal);
	
		banu.salary = 4000;
		banu.bonus = 6000;
		
		banusal = banu.calculateSalary4(banu.salary,banu.bonus);
		
		System.out.println("Day3 Salalry:"+ banusal);
		
		System.out.println("-----------------------------------");
		
		Employee constBanu = new Employee();
		
		constBanu.calculateSalary();//constructor initialized the variables at the execution time
		
		Employee constBanu1 = new Employee(4000,5000);
		constBanu1.calculateSalary();
		
	}
}
