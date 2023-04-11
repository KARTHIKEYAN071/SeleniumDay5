package Day5;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise4 {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement cal=driver.findElement(By.id("datepicker1"));
		cal.click();
		Thread.sleep(3000);
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[2]/a"));
		date.click();
		WebElement From=driver.findElement(By.id("source"));
		From.sendKeys("Coimbatore",Keys.ENTER);
		Thread.sleep(2000);
		WebElement To=driver.findElement(By.id("destination"));
		To.sendKeys("Chennai",Keys.ENTER);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value','08/12/2023')",date);
//		WebElement search=driver.findElement(By.id("seo_search_btn"));
//		search.submit();
		
		
	}
}
