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

	public void invokeBrowser() {

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

		driver.findElement(
				By.xpath("//div[@class='modal fade pop-up-1 in']//div[@class='modal-content']//button[text()='OK']"))
				.click();

	}

	public void searchOneWayFlight() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Set Bengaluru for From

		driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/ul/li[1]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/ul/li[1]/div/ul/li[31]/a")).click();

		// Set Lucknow for To
		driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/ul/li[2]/div/ul/li[48]/a")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Set 3 for Adults
		driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/ul/li[3]/div/div[1]/label[2]/select")).sendKeys("3");

		// Set 2 for Child
		driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/ul/li[3]/div/div[2]/label[2]/select")).sendKeys("2");

		// Click Search
		driver.findElement(By.xpath("//*[@id='oneWay']/form/div[2]/button")).click();

		// Wait for Page load
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

	}

	public void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}

}
