package POD;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Pod {
		// TODO Auto-generated method stub
	WebDriver driver;
	    //Admin side
		@Test(priority = 0)
			public void admin1() {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthick\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  
		    driver = new ChromeDriver();
				driver.get("https://staging.orgfarm.store/admin");
    			driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("karthick23111999.a@gmail.com");
    			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kar@2311");;
    			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/form/div[3]/button")).click();
    			driver.findElement(By.xpath("//*[@id=\"catalog\"]/a")).click();
    			driver.findElement(By.xpath("//*[@id=\"catalog\"]/ul/li[6]/a")).click();
    			driver.findElement(By.xpath("//*[@id=\"input-name\"]")).sendKeys("Mango Banganapalli (Semi Ripe)");
    			driver.findElement(By.xpath("//*[@id=\"button-filter\"]")).click();
    			driver.findElement(By.xpath("//*[@id=\"form-product\"]/div[1]/table/tbody/tr[1]/td[13]/a")).click();
    			driver.findElement(By.xpath("//*[@id=\"form-product\"]/ul/li[5]/a")).click();
    		    String pod=driver.findElement(By.name("pod[6]")).getAttribute("value");    	
    			System.out.println(pod);
			}    	
			@Test(priority = 1)
			public void Front() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthick\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  
			
			    driver = new ChromeDriver();
			driver.get("https://staging.orgfarm.store/");
			driver.manage().window().maximize();

			driver.findElement(By.name("zipcode")).sendKeys("600001");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(12000);
    			driver.findElement(By.xpath("/html/body/div[13]/div/div/div/div/div/img")).click();
    			driver.findElement(By.xpath("/html/body/div[14]/h3/a")).click();
    			JavascriptExecutor js = (JavascriptExecutor) driver;
    			js.executeScript("window.scrollBy(0,700)", "");
    			driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div/div[5]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/a/span[1]")).click();
    			driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[3]/div[2]/a/span[1]")).click();
    			driver.findElement(By.xpath("//*[@id=\"mini-cart-button\"]/span")).click();
    			Thread.sleep(5000);
    			//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    			driver.findElement(By.xpath("//*[@id=\"proceed_to_checkout_button\"]")).click();
    			driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div/div/div[3]/a[1]")).click();
    			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    			driver.findElement(By.linkText("Login with Password")).click();
    			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    			driver.findElement(By.xpath("//*[@id=\"input-email\"][1]")).sendKeys("8344307156");
    			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("9944835585");
    			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    			driver.findElement(By.xpath("//*[@id=\"login\"]/span")).click();
    			driver.findElement(By.xpath("//*[@id=\"address-panel\"]/div[1]/div/p")).click();
    			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    			driver.findElement(By.xpath("//*[@id=\"payment-method-wrapper\"]/div/label[2]/div")).click();
    			JavascriptExecutor jks = (JavascriptExecutor) driver;
    			js.executeScript("window.scrollBy(0,400)", "");
    			Thread.sleep(5000);
    			driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
    			driver.close();
				}
	
    			@AfterTest
			public void karr(){
    				System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthick\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  
    				
    			    driver = new ChromeDriver();
    					driver.get("https://staging.orgfarm.store/admin");
    	    			driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("karthick23111999.a@gmail.com");
    	    			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kar@2311");;
    	    			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/form/div[3]/button")).click();
    	    			driver.findElement(By.xpath("//*[@id=\"catalog\"]/a")).click();
    	    			driver.findElement(By.xpath("//*[@id=\"catalog\"]/ul/li[6]/a")).click();
    	    			driver.findElement(By.xpath("//*[@id=\"input-name\"]")).sendKeys("Mango Banganapalli (Semi Ripe)");
    	    			driver.findElement(By.xpath("//*[@id=\"button-filter\"]")).click();
    	    			driver.findElement(By.xpath("//*[@id=\"form-product\"]/div[1]/table/tbody/tr[1]/td[13]/a")).click();
    	    			driver.findElement(By.xpath("//*[@id=\"form-product\"]/ul/li[5]/a")).click();
    	    		    String pod1=driver.findElement(By.name("pod[6]")).getAttribute("value");
    	    		    System.out.println(pod1);
        		    	//Assert.assertEquals(pod, pod1);
    			}    			
}