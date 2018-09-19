package javaTrainingAtWork;

public class DemoJavaTraining {

	public static void main(String[] args) {


		RiceBags rb = new RiceBags();
		
		int big = 4;
		int small = 4;
		int goal = 4;
		
		int result = rb.calculateRiceBags(big, small, goal);
		System.out.println("Result : "+result);
		

	}

}
