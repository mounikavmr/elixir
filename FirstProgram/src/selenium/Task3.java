package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions  ops  = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		Actions a = new Actions(driver);
//doubleClick()		
		WebElement doubleClick =driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(doubleClick).perform();
		WebElement d =driver.findElement(By.id("doubleClickMessage"));
		System.out.println(d.getText());
		
//contextClick()
		WebElement rightClick =driver.findElement(By.id("rightClickBtn"));
		a.contextClick(rightClick).perform();
		WebElement d1 =driver.findElement(By.id("rightClickMessage"));
		System.out.println(d1.getText());
		
		
		
		
	}

}
