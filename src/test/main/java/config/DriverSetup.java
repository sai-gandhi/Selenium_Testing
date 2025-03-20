package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {
    public static WebDriver getDriver() {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saich\\Downloads\\ChromeDriver&Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Set the path to Chrome binary
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\saich\\Downloads\\ChromeDriver&Chrome\\chrome-win64\\chrome-win64\\chrome.exe");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-web-security");
        return new ChromeDriver(options);
    }
}
