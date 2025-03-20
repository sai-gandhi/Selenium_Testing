package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.DriverSetup;

public class DemoTesting{
	public static void main(String args[]) {
	WebDriver driver = DriverSetup.getDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
   // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hp laptop");
    driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("6301956812");
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Saigandhi@1234");
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hp laptop");
    driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hp laptop");
	}
}
