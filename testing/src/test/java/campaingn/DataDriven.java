import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthick\\Downloads\\chromedriver_win32\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.orgfarm.store/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/a[3]")).click();
        File file = new File("C:\\Users\\karthick\\Documents\\data\\RegisterData.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=wb.getSheet("Sheet2");
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        for(int i=1;i<=rowCount;i++) {
            String First_Name= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(0));
            String Last_Name= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(1));
            String Email_id= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(2));
            String Password= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(3));
            String Phone_Number= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(4));
            String Referrer_id= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(5));
            
			System.out.println(First_Name);
			System.out.println(Last_Name);
			System.out.println(Email_id);
			System.out.println(Password);
			System.out.println(Phone_Number);
			System.out.println(Referrer_id);
			driver.findElement(By.id("FirstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastname")).sendKeys(Last_Name);
			driver.findElement(By.xpath("//*[@id='other_signup_div']/div[3]/div/input")).sendKeys(Email_id);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
			driver.findElement(By.name("telephone")).sendKeys(Phone_Number);
			driver.findElement(By.name("referrer_id")).sendKeys(Referrer_id);
			driver.findElement(By.xpath("//*[@id=\"signup\"]/span")).click();
			
			//Verify the confirmation message
            WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"signup_otp\"]"));
           // element.sendKeys(Keys.chord(Keys.CONTROL, "a"), "55");

            //create a new cell in the row at index 6
            XSSFCell cell = sheet.getRow(i).createCell(6);
            
            //check if confirmation message is displayed
            if (confirmationMessage.isDisplayed()) {
                // if the message is displayed , write PASS in the excel sheet
                cell.setCellValue("PASS");
                
            } else {
                //if the message is not displayed , write FAIL in the excel sheet
                cell.setCellValue("FAIL");
            }
            
            // Write the data back in the Excel file
            FileOutputStream outputStream = new FileOutputStream("C:\\\\Users\\\\karthick\\\\Documents\\\\data\\\\RegisterData.xlsx");
            wb.write(outputStream);

			driver.findElement(By.xpath("//*[@id=\"signupModal-popup\"]/div/div/div/div[1]/img")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div/div/a[3]")).click();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            
            
           // driver.navigate().refresh();

			
			//boolean VerifyOtp = driver.findElement(By.xpath("//*[@id=\"signup_otp\"]")).isDisplayed();
			//String actualTitle = driver.getTitle();
			//String expectedTitle = "OrgFarm";
			//Assert.assertEquals(expectedTitle,actualTitle);
        }
			System.out.println("exicted");
			Thread.sleep(2000);

		}

}

	
	

