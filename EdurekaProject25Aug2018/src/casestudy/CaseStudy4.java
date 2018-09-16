package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='inputName']")).click();
		driver.findElement(By.xpath("//input[@id='inputName']")).clear();
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("vijaya_banu@yahoo.com");
	
		
		driver.findElement(By.xpath("//input[@class='form-control inputloginmain password_signin noerror']")).click();
		driver.findElement(By.xpath("//input[@class='form-control inputloginmain password_signin noerror']")).sendKeys("Selenium#01");
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//button[@class='startlearningbtn defdisablesignin ga_signup_info']")).click();
		System.out.println("Log in button detected");
		
		
		//WebDriver driver = new FirefoxDriver();
		//String mobNo = "99xxxxxxxx";
		//WebElement mobileElementIrs = 
		//driver.findElement(By.id("mobileNoPrimary"));
		//mobileElementIrs.click();
		//mobileElementIrs.clear();
		//mobileElementIrs.sendKeys(mobNo);
	}
	

	public void navigateToProfile() {
		
		driver.findElement((By.xpath(" //header[@id=\"header-II\"]//li[@class=\"dropdown userdrop hidden-sm hidden-xs open\"]//span[@class=\"webinar-profile-name\"]"))).click();
		// //header[@id="header-II"]//li[@class="dropdown userdrop hidden-sm hidden-xs open"]//span[@class="webinar-profile-name"]
		
	}
	
}
