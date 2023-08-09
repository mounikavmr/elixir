package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Task_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions  ops  = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		screenShot(driver);
		
		 
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");
	
		
	}
	public static void screenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;//
		
		File source=ts.getScreenshotAs(OutputType.FILE);

		File dest=new File("C:\\Screenshot\\FacebookLoginpage.jpg");
		FileHandler.copy(source, dest); 
	}

}
