package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Banu\\Documents\\SeleniumCertificationCourse\\lib\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		Dimension dim = new Dimension(600,600);
		
		driver.manage().window().setSize(dim);

		// maximizes the window
		//driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// navigate to an URL
		driver.get("http://qatechhub.com");

	}
	
	
	
	String getPageTitle() {
		
		return driver.getTitle();
	}
	
	
	//.get and navigate are the same; different ways to achieve the same
	void navigateCommands() {
	
		driver.navigate().to("http://www.google.com");
		
		//Back to the browsing history
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		//Refresh
		driver.navigate().refresh();
	}
	
	void closeBrowser() {

		
		//driver.close();
		
		
		//closes all the windows
		//kills the exe as well
		driver.quit();
	}

}
