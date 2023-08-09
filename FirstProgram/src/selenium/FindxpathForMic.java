package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindxpathForMic {

	public static void main(String[] args) {
		ChromeOptions  ops  = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//div[@class='XDyW0e']"));
		
	     highlight(driver,e);
	}
private static void  highlight(WebDriver driver,WebElement e) {
		
		// TODO Auto-generated method stub
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background:yellow;');",e);
	}

}
