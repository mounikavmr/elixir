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
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions  ops  = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		for(int i=1;i<=5;i++) {
		TakesScreenshot ts=(TakesScreenshot)driver;//
		
		File source=ts.getScreenshotAs(OutputType.FILE);// It is used to take the ScreenShot
//		// After taking screenShot it will Store in random location	
		File dest=new File("C:\\Screenshot\\FlipkartLoginpage.jpg" +i + ".jpg");
		
		FileHandler.copy(source, dest);  
		}
	}

	//jse.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",e);

}
	

