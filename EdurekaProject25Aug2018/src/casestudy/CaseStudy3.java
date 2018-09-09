package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseStudy3 {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Banu\\Documents\\SeleniumCertificationCourse\\lib\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void clickOneWay() {

		driver.findElement(By.linkText("One Way")).click();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		////div[@class='modal fade pop-up-1 in']//div[@class='modal-content']//button[text()='OK']
			
		driver.findElement(By.xpath("//div[@class='modal fade pop-up-1 in']//div[@class='modal-content']//button[text()='OK']")).click();	
			

			

	}

	public void searhcFlight() {

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//input[@class=\"origins-value city-name-value\" and @placeholder=\"From\" and @style=\"outline: 0\"]"))
				.click();
		
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();;

		// //div[@id='oneWay']/form//button
	
			}
	
	public void searchState() {

		String tripType = "oneWay";
		String destination = "to";
		String city = "Delhi";

		String cityXpath = String.format(
				"//div[@id='%s']/form//div[@class='city-dropdown-list city-name-%s']//a[contains(text(),'%s')]",
				tripType, destination, city);
	}

}
