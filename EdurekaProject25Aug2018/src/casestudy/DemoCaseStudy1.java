package casestudy;

public class DemoCaseStudy1 {

	public static void main(String[] args) {

		WorkingWithChrome wc = new WorkingWithChrome();

		// Step1 : Launch Chrome browser using Selenium WebDriver
		wc.invokeBrowser();

		// 2.Navigate to "http://www.edureka.co/"
		// 3. Maximise the Browser Window

		wc.navigateCommands();

		// Step8: Search Course by different Web Elements

		// Search, Click Log In by Link Text
		wc.searchCourseById();
		//wc.searchCourseByName();
		wc.searchCourseByCSSSelector();
		wc.loginByLinkText();
		wc.closeBrowser();

		// Click Log in by Partial Link Text
		wc.invokeBrowser();
		wc.navigateCommands();
		wc.loginByPartialLinkText();
		wc.closeBrowser();

		// Click Log in by XPath
		wc.invokeBrowser();
		wc.navigateCommands();
		wc.loginByXPath();
		wc.closeBrowser();

	}

}
