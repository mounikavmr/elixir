package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions  ops  = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Dimension d = new Dimension(1000,500);
		driver.manage().window().setSize(d);
		
		Point p = new Point(500,500);
		driver.manage().window().setPosition(p);
		
	}

}

