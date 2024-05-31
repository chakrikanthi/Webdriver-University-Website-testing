package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompletetextfield {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h1[text()='AUTOCOMPLETE TEXTFIELD']")).click();

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		WebElement inputfield=driver.findElement(By.xpath("//input[@id='myInput']"));
		WebElement Submitbtn=driver.findElement(By.xpath("//input[@id='submit-button']"));
		inputfield.sendKeys("a");
		inputfield.sendKeys(Keys.ARROW_DOWN);
		inputfield.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		Submitbtn.click();
		System.out.println("Item got submitted successfully");
	}

}
//output:Item got submitted successfully