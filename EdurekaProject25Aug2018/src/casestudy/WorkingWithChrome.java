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

	public void searchCourseById() {

		driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
		driver.findElement(By.id("homeSearchBar")).clear();
		System.out.println("Search by ID successful");

	}

	public void searchCourseByName() {

		driver.findElement(By.name("user_v1[query]")).sendKeys("Selenium");
		driver.findElement(By.name("user_v1[query]")).clear();
		System.out.println("Search by Name successful");

	}

	public void searchCourseByClassName() {

		driver.findElement(By.className("search_input")).sendKeys("Testing");
		driver.findElement(By.className("search_input")).clear();
		System.out.println("Search by Class name successful");

	}

	public void searchCourseByCSSSelector() {

		
		 driver.findElement(By.cssSelector("input#homeSearchBar")).sendKeys("Testing");
		 driver.findElement(By.cssSelector("input#homeSearchBar")).clear();
		 System.out.println("Search by CSS Selector successful");

		
	}

	public void loginByLinkText() {

		driver.findElement((By.linkText("Log In"))).click();
		System.out.println("Login click by Link text successful");
		
	}

	public void loginByPartialLinkText() {

		driver.findElement((By.partialLinkText("Log"))).click();
		System.out.println("Login click by Partial Link text successful");
	}

	public void loginByXPath() {

		driver.findElement(By.xpath("//a[@class=\"signin top-signin\"]")).click();
		System.out.println("Login click by xpath successful");
	}

	void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}
	
	
	

}
