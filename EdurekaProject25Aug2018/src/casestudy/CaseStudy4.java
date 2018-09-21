package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy4 {

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

	public void logIn() {

		driver.findElement(By.linkText("Log In")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inputName']")));

		element.sendKeys("vijaya_banu@yahoo.com");

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pwd1']")));
		element.sendKeys("Selenium#01");

		driver.findElement(By.xpath("//*[@id='signinForm']/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void mouseHover() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement profileLink = driver
				.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a/span"));

		Actions action = new Actions(driver);

		action.moveToElement(profileLink).perform();
		profileLink.click();

		WebElement myProfile = driver
				.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[1]/a"));

		action.moveToElement(myProfile).click().build().perform();
	}

	public void navigateThruProfile() {

		driver.findElement(By.xpath("//*[@id=\"personal_details\"]/i")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//button[contains(text(),\"Continue\") and @class=\"btn btn-default pull-right verify-continue-btn\"]"))
				.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button[1]"))
				.click();
		

	}

	public void logOut() {

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement profileLink = driver.findElement(By.xpath("//span[contains(text(),\"Vijayabanu\")]"));

		Actions action = new Actions(driver);

		action.moveToElement(profileLink).perform();
		profileLink.click();

		WebElement logOut = driver.findElement(By.linkText("Log Out"));

		action.moveToElement(logOut).click().build().perform();
	}

	public void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}
}
