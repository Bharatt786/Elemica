package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("Webdriver.edge.driver",
    		  "C:\\Users\\hi\\Downloads\\edgedriver_win64 null\\edgedriver.exe");
      WebDriver driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://dashboard.elemica.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      
      WebElement txtusername = driver.findElement(By.name("userId")); 
      txtusername.sendKeys("BTingrikar");
       
      WebElement txtpassword = driver.findElement(By.name("password")); 
      txtpassword.sendKeys("Bablu@789");
            
      WebElement btnLogin = driver.findElement(By.xpath("//input[@type='image']"));
      btnLogin.click();
      WebElement txtsender = driver.findElement(By.name("sender"));
      txtsender.sendKeys("039055660");
      WebElement txtreceiver = driver.findElement(By.name("receiver"));
      txtreceiver.sendKeys("OXYMENLOPDX");
      
   // 1. find the element
      WebElement DocumentType = driver.findElement(By.name("documentType"));

	// 2. create the object of Select class
      Select document = new Select(DocumentType);

     // Thread.sleep(4000);
      // 3. select an option
  //    sel.selectByVisibleText("text 3");
  //    sel.selectByIndex(4);
      document.selectByValue("chemXMLLoadTenderMotorV2.0.2");
      
      WebElement datebegain = driver.findElement(By.id("dateimg3"));
      datebegain.click();
    		  WebElement datebegain1 = driver.findElement(By.xpath("//a[@href='javascript:prevYear();']//font[@color='#FFFFFF']//b[contains(text(),'<<')]"));
    		  datebegain1.click();
    		  WebElement datebegain2 = driver.findElement(By.xpath("//a[normalize-space()='1']"));
    		  datebegain2.click();
    		  
    		  WebElement btnsearch = driver.findElement(By.cssSelector("input[type='image'][src='/dashboard/images/button_search.gif']"));
      btnsearch.click();
	}
	

}
