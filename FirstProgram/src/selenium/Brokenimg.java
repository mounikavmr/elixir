package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brokenimg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement>images=driver.findElements(By.tagName("img"));
		
		// Loop through each link and check if its a broken Url
		
		for(WebElement image: images) {
			String url=image.getAttribute("src");
			if(url!=null && !url.isEmpty())
			{
				
				try {
					HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
					connection.setRequestMethod("HEAD");
					
					connection.connect();
					int responseCode=connection.getResponseCode();
					
					if(responseCode<=200) {
						System.out.println("Broken IMG :"+url);
					}
				}catch (Exception e) {
					System.out.println("Exception occured while checking IMG :"+url);
				}

			}
			}
		}
			
		
	}


