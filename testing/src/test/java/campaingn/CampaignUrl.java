package campaingn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CampaignUrl {

	//@Test
	public void campaignUrl() {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\karthick\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.orgfarm.store/store/chennai-standardzipcode=600001&source=campaign");
		//String actualTitle = driver.getTitle();
		//String expectedTitle = "OrgFarm";
		//Assert.assertEquals(expectedTitle,actualTitle);
		driver.quit();
	}
}
