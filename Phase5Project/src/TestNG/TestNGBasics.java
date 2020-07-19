package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
	 WebDriver driver;
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com");
			

	}
	@Test
	public void verifyPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("the page title is "+title);
		
		Assert.assertEquals(title, "My Store" );
		}
	
	
		@Test
		public void CreateAccountTest() {
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("email_create")).sendKeys("bhuvani@gmail.com");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.id("SubmitCreate")).click();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.id("customer_firstname")).sendKeys("Bhuvani");
			driver.findElement(By.id("customer_lastname")).sendKeys("S");
			driver.findElement(By.id("password")).sendKeys("bhuvani123@");
			driver.findElement(By.id("firstname")).sendKeys("Bhuvani");
			driver.findElement(By.id("lastname")).sendKeys("S");
			driver.findElement(By.id("address")).sendKeys("7 potwell, us");
			driver.findElement(By.id("city")).sendKeys("usa");
			driver.findElement(By.id("id_state")).sendKeys("usa");
			driver.findElement(By.id("postcode")).sendKeys("60004");
			driver.findElement(By.id("phone_mobile")).sendKeys("1234567891");
			driver.findElement(By.id("alias")).sendKeys("34 street 3, albeni dek");
			driver.findElement(By.id("submitAccount")).click();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			
			}
	
	
	
	@Test
	public void SignInTest() {
		System.out.println("sign in");
		driver.findElement(By.linkText("sign in")).click();
		
		//To login
		driver.findElement(By.id("email")).sendKeys("bhuvani@gmail.com");
		driver.findElement(By.id("password")).sendKeys("bhuvani123@");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("sign out");
		driver.findElement(By.linkText("sign out")).click();
		
	}
		
		

	@Test (priority = 0)
	public void SearchTest() {
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("submit_search")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
		
		@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
