package outofstock;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutOfStock {

		// TODO Auto-generated method stub

		public static void main(String[] args) throws InterruptedException, AWTException {  
	    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Documents\\driver\\chromedriver.exe");  

	    		WebDriver driver = new ChromeDriver();
	    		driver.get("https://staging.orgfarm.store/");
	    		driver.manage().window().maximize();
	    		driver.findElement(By.name("zipcode")).sendKeys("600001");
	    		driver.findElement(By.id("submit")).click();
	    		Thread.sleep(5000);
	    		//Handling popup
	    		if (driver.findElement(By.xpath("//*[@id='bannermodal']/div/div/div/div/img")).isDisplayed())
	    		{
	    			Thread.sleep(3000);
	    			driver.findElement(By.xpath("//*[@id='bannermodal']/div/div/div/div/img")).click();
	    		}
	    		//Handling popup
	    		if (driver.findElement(By.xpath("//*[@data-dismiss='alert']")).isDisplayed())
	    		{
	    			Thread.sleep(3000);
	    			driver.findElement(By.xpath("//*[@data-dismiss='alert']")).click();
	    		}
	    		
	    		driver.findElement(By.linkText("Fresh Vegetables")).click();
	    		Thread.sleep(5000);
	    		JavascriptExecutor js = (JavascriptExecutor) driver;
	    		 for (int i = 0; i < 800; i += 5)
	    		   {
	    		      js.executeScript("window.scrollTo(0, " + i + ")");
	    		   }
	    		 Thread.sleep(10000);
	    		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    		Thread.sleep(5000);
	    		//Total count product
	    		int icount = driver.findElements(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div")).size();
	    		int j =0;
	    		for(int i=1; i<=icount ;i++)
	    		{
	    			try{
	    				//Out of stock products
	    			if(driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[" + i + "]/div[2]/div[2]/div/div/div[2]/div[2]/span")).isDisplayed())
	    			{
	    				String test = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[" + i + "]/div[2]/div[2]/div/div/div[2]/div[2]/span")).getText();
	    				if (test.equalsIgnoreCase("Out of stock"))
	    				{
	    				
	    				String vegetableName = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/div/div[" + i + "]/div[2]/div[2]/h3")).getText();
	    				System.out.println(vegetableName);
	    				j++;
	    			}
	    			}
	    			}catch (NoSuchElementException e) {
	    			    System.out.println(e);
	    			}
	    			
	    		}
	    		System.out.println("Out of Stock product "+j);
	    }
	
	}


