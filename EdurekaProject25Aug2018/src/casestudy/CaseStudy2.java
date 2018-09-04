package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2 {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Banu\\Documents\\SeleniumCertificationCourse\\lib\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://www.edureka.co/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);

	}

	public void searchCourseByName() {

		driver.findElement(By.name("user_v1[query]")).sendKeys("Selenium");

		driver.findElement(By.id("homeSearchBar")).sendKeys(Keys.RETURN);

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//h3[@class='coursetitle course-display-title-535']")).click();
		
		//driver.findElement(By.cssSelector("a[@href*='/testing-with-selenium-webdriver']")).click();
		//System.out.println("xpath worked");

	}

	public String printTitleOfThePage() {
		
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 return driver.getTitle();
		
	}

	
	public void navigateCommands() {
		
				
		//Back to the browsing history
		driver.navigate().back();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	
	public void clickAllCourses() {
		
	
		
		driver.findElement(By.linkText("All Courses")).click();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}
	
}
