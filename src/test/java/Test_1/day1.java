package Test_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.DriverSetup;

public class day1 {
	
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=DriverSetup.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("916301956812");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Saigandhi@1234");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']']")).sendKeys("iq z6 lite ");
		
		
		
	}

}
