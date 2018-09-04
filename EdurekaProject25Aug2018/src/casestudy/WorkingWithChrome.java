package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Banu\\Documents\\SeleniumCertificationCourse\\lib\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		// Delete all cookies
		driver.manage().deleteAllCookies();

	}

	
	// .get and navigate are the same; different ways to achieve the same
	void navigateCommands() {

		// navigate to an URL
		driver.navigate().to("https://www.edureka.co/");

		// maximizes the window
		driver.manage().window().maximize();

	}

		
	public void inspectCourse() {
	
		
		driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
		driver.findElement(By.id("homeSearchBar")).clear();
		
		
		
		
	}
	
	
	void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}

}
