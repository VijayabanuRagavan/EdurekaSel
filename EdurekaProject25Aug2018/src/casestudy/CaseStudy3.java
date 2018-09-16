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


	
	public void searchOneWayFlight() {

		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='oneWay']/form//div[@class='city-dropdown-list city-name-from']//a[contains(text(),'Bengaluru')]")).click();
		//driver.findElement(By.xpath("//div[@id='oneWay']/form//input[@placeholder='To']")).sendKeys("Lucknow (LKO)");
    
		driver.findElement(By.xpath("//div[@id='oneWay']/form//div[@class='city-dropdown-list city-name-from']//a[contains(text(),'Lucknow')]")).click();
		driver.findElement(By.xpath("//div[@id='oneWay']/form//button[@type='submit']")).click();
		
		
		

		
	}

}
