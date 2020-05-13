package brokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement elements=links.get(i);
			String URL= elements.getAttribute("href");
			
			
			
			//VerifyActiveLinks(uniform);
		}

	}

	

}
