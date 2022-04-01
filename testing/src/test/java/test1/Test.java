package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
//import org.testng.Assert;

import org.openqa.selenium.JavascriptExecutor;

public class Test {
	//public static void main(String[] args) {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthick\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.orgfarm.store/");
		driver.manage().window().maximize();
		driver.findElement(By.name("zipcode")).sendKeys("600001");
		driver.findElement(By.id("submit")).click();
		//Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Fresh Fruits")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/a/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[2]/div/div/div[2]/div[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mini-cart-button\"]/span")).click();
		Thread.sleep(15000);

		//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"proceed_to_checkout_button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div/div/div[3]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-email\"][1]")).sendKeys("8344307156");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("9944835585");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"login\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"address-panel\"]/div[1]/div/p")).click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//*[@id=\"payment-method-wrapper\"]/div/label[2]/div")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();

		
		
		




		

		//js.executeScript("window.scrollBy(100,500)", "");
	      //Thread.sleep(5000);

		//driver.findElement(By.linkText("Create Account")).click();
		//WebElement signup =driver.findElement(By.id("signup"));
		//.click();
		/* String expectedErrorMsg = "First Name must be between 1 and 32 characters!";
	        
	        WebElement exp = driver.findElement(By.linkText("//*[@id=\"other_signup_div\"]/div[1]/div/p"));
	        
	        int count = driver.findElements(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div")).size();
	        for(int i =2, i<count;i++)
	        {
	        	
	        }*/
		
	}

}
