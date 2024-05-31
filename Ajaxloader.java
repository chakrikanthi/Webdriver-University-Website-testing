package WebdriverUniversityWebsitetesting;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajaxloader {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(90)); 
		
		//AJAX LOADER
		WebElement Ajaxloader=driver.findElement(By.xpath("//h1[text()='AJAX LOADER']"));
		Ajaxloader.click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoad time: "+duration.toMillis() + " milli seconds");
		
		System.out.println(driver.getTitle());
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //span[@class='btn btn-default btn-lg dropdown-toggle']//p[text()='CLICK ME!']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //span[@class='btn btn-default btn-lg dropdown-toggle']//p[text()='CLICK ME!']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
	}

}
