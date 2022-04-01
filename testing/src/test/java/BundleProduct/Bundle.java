package BundleProduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Bundle {
	@Test
	public void campaignUrl() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\karthick\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
		driver.get("https://orgfarm.store/");
		driver.manage().window().maximize();
		driver.findElement(By.name("zipcode")).sendKeys("600001");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(15000);
		
		//Handling popup
			driver.findElement(By.xpath("/html/body/div[15]/h3/a")).click();
		//Thread.sleep(5000);
					//driver.findElement(By.xpath("/html/body/div[13]/div/div/div/div/div/img")).click();/*[@id='bannermodal']/div/div/div/div/img*/
	
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div[1]/a/img")).click();
		Thread.sleep(5000);

		//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2800)", "");
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/a/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mini-cart-button\"]/span")).click();
		Thread.sleep(5000);

		//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"proceed_to_checkout_button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div/div/div[3]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"input-email\"][1]")).sendKeys("8344307156");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("9944835585");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"login\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"address-panel\"]/div[1]/div/p")).click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"coupon\"]")).sendKeys("pd20");
		driver.findElement(By.xpath("//*[@id=\"promo-form-button\"]")).click();
		Thread.sleep(10000);
		if(driver.getPageSource().contains("Warning: This coupon is not applicable for Bundle products")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
		WebElement ele = driver.findElement(By.xpath("/html/body/div[5]/div[4]/div/div/div[2]/div/div/div[1]/div[5]"));
    	System.out.println("The Result is - " +ele.getText());
        /*WebElement confirmationMessage = driver.findElement(By.linkText("Warning: This coupon is not applicable for Bundle products"));///html/body/div[5]/div[4]/div/div/div[2]/div/div/div[1]/div[5]/text()[1]

		   if (confirmationMessage.isDisplayed()) {
               // if the message is displayed , write PASS in the excel sheet
			   System.out.println("PASS");
               
           } else {
               //if the message is not displayed , write FAIL in the excel sheet
        	   System.out.println("FAIL");
           }*/
           

		//driver.findElement(By.xpath("//*[@id=\"payment-method-wrapper\"]/div/label[2]/div")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)", "");
		//Thread.sleep(5000);

		//driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
		
	/*	String actualTitle = driver.findElement(By.xpath("/html/body/div[5]/div[4]/div/div/div[2]/div/div/div[1]/div[5]/text()[1]"));
		String expectedTitle = "Warning: This coupon is not applicable for Bundle products";
		Assert.assertEquals(expectedTitle,actualTitle);*/
		driver.quit();
	}


}
