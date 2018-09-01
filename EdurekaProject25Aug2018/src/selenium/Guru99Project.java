package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Banu\\Documents\\SeleniumCertificationCourse\\lib\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		Dimension dim = new Dimension(600, 600);

		driver.manage().window().setSize(dim);

		// maximizes the window
		// driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// navigate to an URL
		driver.get("http://demo.guru99.com/v4");
	}

	public void login(String userEmailId, String password) {

		WebElement userId = driver.findElement(By.name("uid"));

		userId.sendKeys(userEmailId);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement((By.name("btnLogin"))).click();

	}

	void closeBrowser() {

		// driver.close();

		// closes all the windows
		// kills the exe as well
		driver.quit();
	}
}