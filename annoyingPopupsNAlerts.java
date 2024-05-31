package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class annoyingPopupsNAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupnalerts=driver.findElement(By.xpath("//h1[text()='POPUP & ALERTS']"));
		popupnalerts.click();
		Thread.sleep(1000);
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		WebElement alert1=driver.findElement(By.xpath("//span[@id='button1']//p[contains(text(),'CLICK ME!')]"));
		alert1.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("JavaScript Alert got executed successfully");
		
		WebElement alert2=driver.findElement(By.xpath("//span[@id='button2']//p[contains(text(),'CLICK ME!')]"));
		alert2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		System.out.println("Modal popup got executed successfully");
		
		WebElement alert3=driver.findElement(By.xpath("//a[normalize-space()='CLICK ME!']"));
		alert3.click();
		Thread.sleep(1000);
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30)); 
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //span[@class='btn btn-default btn-lg dropdown-toggle']//p[text()='CLICK ME!']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //span[@class='btn btn-default btn-lg dropdown-toggle']//p[text()='CLICK ME!']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		System.out.println("Ajax Loader got executed successfully");
		driver.navigate().back();
		
		WebElement alert4=driver.findElement(By.xpath("//span[@id='button4']//p[contains(text(),'CLICK ME!')]"));
		alert4.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("First time :"+driver.findElement(By.xpath(" //p[@id='confirm-alert-text']")).getText());
		alert4.click();
		driver.switchTo().alert().dismiss();
		System.out.println("Second time :"+driver.findElement(By.xpath(" //p[@id='confirm-alert-text']")).getText());
		driver.quit();

	}

}

/*output:
 * JavaScript Alert got executed successfully
Modal popup got executed successfully
Ajax Loader got executed successfully
First time :You pressed OK!
Second time :You pressed Cancel!
*/
