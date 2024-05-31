package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h1[text()='DATEPICKER']")).click();

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		WebElement calendar=driver.findElement(By.xpath("//div[@id='datepicker']//span//i"));
		calendar.click();
		WebElement nextmonth=driver.findElement(By.xpath("//body/div/div[3]/table[1]/thead[1]/tr[1]/th[3]"));
		nextmonth.click();
		
		
		
	}

}
