package HomeWork4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumHomeWork {

	public static void main(String[] args) {

		String testUrl = "http://www.leafground.com/pages/Window.html";
		String firstWindowTitle;
		String secondWindowTitle;
				
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(testUrl);
		String mainWindow = driver.getWindowHandle();
		firstWindowTitle = driver.getTitle();
		System.out.println(firstWindowTitle);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).perform(); 
		driver.findElement(By.id("color")).click();
		
		
		Set <String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.toArray()[1].toString());
		
						
		secondWindowTitle = driver.getTitle();
		System.out.println(secondWindowTitle);
		driver.switchTo().window(mainWindow);
		
		
	}
}
