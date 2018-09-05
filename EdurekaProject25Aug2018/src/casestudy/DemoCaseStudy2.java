package casestudy;

public class DemoCaseStudy2 {

	public static void main(String[] args) {
		CaseStudy2 wc = new CaseStudy2();

		//Launch,Navigate,Timeout
		//Steps 1 - 6
		wc.invokeBrowser();
		System.out.println("Invoke Browser successful");
		
		//Search by name and Enter
		//Steps 7-8
		wc.searchCourseByName();
		System.out.println("Search by Course name successful");
		
		//Retrieve and compare Page Title
		//steps 9 - 10
		String expected = "Selenium 3.0 WebDriver Online Training";
		String actual = wc.printTitleOfThePage();
		
		System.out.println("Page Title:" + actual);
		
		if(actual.contains(expected)) {
			System.out.println("Title contains: " + expected);
		}
		else {
			System.out.println("Title Does not contain:"+ expected);
		}
		
		
		//Navigate back and wait
		//steps 11
		wc.navigateCommands();
		
		
		//Click All courses and wait
		//Steps 12-13
		wc.clickAllCourses();
		System.out.println("All Course page loaded successfully");
		
		//wc.closeBrowser();
		
	}

}
