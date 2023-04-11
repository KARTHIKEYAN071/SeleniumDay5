package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise1 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/droppable/");
		WebElement drag1=driver.findElement(By.id("draggable"));
		WebElement drag2=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag1, drag2).build().perform();

		
	}
}
