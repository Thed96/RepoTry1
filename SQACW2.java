package SQAtests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SQACW2 {

	//Define the web driver
    WebDriver driver ;

	@BeforeTest
	public void beforeTest() {
		//Set Chrome driver with path
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\acer\\\\eclipse-workspace\\\\Practice\\\\ThirdPartyResources\\\\ChromeDriver\\\\chromedriver-v103.exe");

		driver = new ChromeDriver();
		
		//Call the Chrome browser and maximize in the desktop
		driver.manage().window().maximize();

		//Call URL
		driver.get("https://www.catchme.lk/ ");

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "CatchMe.lk: Your Trusted Online Shopping Store in Sri Lanka";

		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Confirmed the Title");
		System.out.println("verify its launching through an assertion - Successful");
	}


	@Test
	public void f() throws InterruptedException {
		Thread.sleep(3000);
		//Identify the Login Button in the UI
		WebElement RegisterClick = driver.findElement(By.xpath("//*[@id=\"app\"]/header/div[1]/div/div/div[4]/div[1]/div[2]/div/div[1]/button[2]"));
		//Click the Next button in the UI
		RegisterClick.click();
		
		Boolean checkButtonPresence = RegisterClick.isDisplayed();
        Assert.assertTrue(checkButtonPresence);
        System.out.println("Button is displayed");
	}


	@AfterTest
	public void afterTest() {
	}

}
