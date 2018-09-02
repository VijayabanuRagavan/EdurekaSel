package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartProject {

	
	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Banu\\Documents\\SeleniumCertificationCourse\\lib\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		//Dimension dim = new Dimension(600, 600);

		//driver.manage().window().setSize(dim);

		// maximizes the window
		// driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// navigate to an URL
		driver.get("http://www.flipkart.com");
	}
	
	void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}
	
	
	public void mouseHover(){
		
		
		WebElement  electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronicsLink).build().perform();
		
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		
		action.moveToElement(samsungLink).click().build().perform();
	}

}
