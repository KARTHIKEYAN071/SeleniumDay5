package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise3 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement num=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		num.sendKeys("401");
		WebElement submitbtn=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		submitbtn.submit();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		num.clear();
		num.sendKeys("402");
		submitbtn.submit();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);


		
		
		
	}
}
