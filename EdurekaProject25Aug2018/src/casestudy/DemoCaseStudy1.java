package casestudy;

public class DemoCaseStudy1 {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		//Step1 : Launch Chrome browser using Selenium WebDriver
		wc.invokeBrowser();
		
		//2.Navigate to "http://www.edureka.co/"
		//3. Maximise the Browser Window
		
		wc.navigateCommands();
		
		//Step4 
		
		wc.inspectCourse();
		
	}

}
