package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Testlogin {
	
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
	      
	      WebDriver driver1 = new EdgeDriver();
	      driver1.manage().window().maximize();
	      driver1.get("https://dashboard.elemica.com");
	      WebElement txtusername1 = driver1.findElement(By.name("userId")); 
	      txtusername1.sendKeys("BTing");
	       
	      WebElement txtpassword1 = driver1.findElement(By.name("password")); 
	      txtpassword1.sendKeys("Bablu");
	            
	      WebElement btnLogin1 = driver.findElement(By.xpath("//input[@type='image']"));
	      btnLogin1.click();
	      
	      WebDriver driver2 = new EdgeDriver();
	      driver2.manage().window().maximize();
	      driver2.get("https://dashboard.elemica.com");
	      WebElement txtusername2 = driver2.findElement(By.name("userId")); 
	      txtusername2.sendKeys("");
	       
	      WebElement txtpassword2 = driver2.findElement(By.name("password")); 
	      txtpassword2.sendKeys("");
	            
	      WebElement btnLogin2 = driver.findElement(By.xpath("//input[@type='image']"));
	      btnLogin2.click();
	}
}
