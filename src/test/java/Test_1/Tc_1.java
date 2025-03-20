package Test_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.DriverSetup;

public class Tc_1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        
        driver.get("http://localhost:8080/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //For Home page of the application
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        
        //back to the home page of the application 
       WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
       
       if(login.isDisplayed()) {
    	   System.out.println("Login is present");
       }
       else {
    	   System.out.println("Login is not present");
       }
       
       
       //For About page of the Application
        driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
        Thread.sleep(5000);
        
        WebElement image=driver.findElement(By.xpath("//img[@alt='Team Member 3']"));
        
        if(image.isDisplayed()) {
        	System.out.println("Image is Displayed");
        }
        else {
        	System.out.println("Image is Not Dispalyed");
        }
        
        driver.navigate().back();
        
        driver.findElement(By.cssSelector("a[href='/adminlogin']")).click();
        
        driver.findElement(By.cssSelector("input[name='auname']")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[name='apwd']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='Courses']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='View All Courses']")).click();
        
        WebElement countpresent=driver.findElement(By.xpath("//h2[contains(text(),'Total Courses:')]"));
        if(countpresent.isDisplayed()) {
        	System.out.println("Course count is present");
        }
        else {
        	System.out.println("Course count is not present");
        }
        driver.findElement(By.xpath("//a[normalize-space()='Add Courses']")).click();
        driver.findElement(By.xpath("//input[@id='courseName']")).sendKeys("Java programming");
        driver.findElement(By.xpath("//input[@id='courseCode']")).sendKeys("22jp2025");
        driver.findElement(By.xpath("//textarea[@id='courseDescription']")).sendKeys("Java programming");
        driver.findElement(By.xpath("//button[normalize-space()='Add Course']")).click();
        
        
        driver.findElement(By.xpath("//a[normalize-space()='Courses']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='View All Courses']")).click();
        
        WebElement course=driver.findElement(By.xpath("//td[normalize-space()='Java programming']"));
        
        if(course.isDisplayed()) {
        	System.out.println("The given Course is present");
        }
        else {
        	System.out.println("The given Course is not present");
        }
        
      /*  
        driver.findElement(By.xpath("//a[normalize-space()='Student Registration']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Enter your user name.']")).sendKeys("Uppalapati Sai Gandhi");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        
        WebElement datePicker = driver.findElement(By.xpath("//input[@placeholder='Enter your date of birth']")); // Change 'dateOfBirth' to your element's I
        // Clear any existing value and set the date directly (if the input field allows direct entry)
        datePicker.clear();
        datePicker.sendKeys("04-14-2001");
        driver.findElement(By.xpath("//input[@placeholder='Enter your mail id.']")).sendKeys("saichows64@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Keep a strong password.']")).sendKeys("Sai@123");
        driver.findElement(By.xpath("//input[@placeholder='Enter your location']")).sendKeys("Khammam");
        driver.findElement(By.xpath("//input[@placeholder='Enter your 10digits contact number']")).sendKeys("2200031955");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        
       */
        
        driver.quit();
        
	}
	

}
