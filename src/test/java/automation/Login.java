package automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://eticket.railway.gov.bd/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("mobile_number")).sendKeys("01799034473");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.id("password")).sendKeys("admin1211"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		
		driver.findElement(By.className("login-form-submit-btn")).click();		
		

	}

}
