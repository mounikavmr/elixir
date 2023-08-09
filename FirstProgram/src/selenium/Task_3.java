package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions  ops  = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		Actions a = new Actions(driver);
				
//click		
		WebElement e=driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		a.moveToElement(e).click().build().perform();
//dragAndDrop		
		WebElement source=driver.findElement(By.id("acceptable"));
		System.out.println(source.getText());
		WebElement dest=driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		System.out.println(dest.getText());
		a.dragAndDrop(source, dest).perform();
		System.out.println(dest.getText());
		
	
		
	}

}
